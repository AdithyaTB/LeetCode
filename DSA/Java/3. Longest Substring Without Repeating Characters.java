class Solution {
    public int lengthOfLongestSubstring(String s) {
       int maxLength = 0;
       int left = 0;
       HashSet<Character> visited = new HashSet<>();

       for (int right = 0; right < s.length(); right++) {
         while(visited.contains(s.charAt(right))) {
            visited.remove(s.charAt(left));
            left++;
        }
         visited.add(s.charAt(right));
         maxLength = Math.max(maxLength, right - left + 1);
       }
       return maxLength;
    }
}
