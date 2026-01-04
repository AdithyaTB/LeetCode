class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet <Integer> h1 = new HashSet<>();
        HashSet <Integer> h2 = new HashSet<>();

        for (int n1 : nums1) h1.add(n1);
        for (int n2 : nums2) h2.add(n2);

        for (int n2 : nums2) {
            if (h1.contains(n2)) {
                h1.remove(n2);
                h2.remove(n2);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(h1));
        ans.add(new ArrayList<>(h2));
        return ans;

    }
}
