import java.util.*;

class Solution {
    public int numberOfBeams(String[] bank) {
        int beams = 0, prev = 0;

        for (String row : bank) {
            int devices = 0;

            // Count number of '1's in the current row
            for (char c : row.toCharArray()) {
                if (c == '1') devices++;
            }

            if (devices > 0) {
                beams += prev * devices;
                prev = devices;
            }
        }

        return beams;
    }
}
