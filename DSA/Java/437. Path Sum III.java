class Solution {
    Map<Long , Integer> map; 
    int count;

    public int pathSum(TreeNode root, int targetSum) {
        map = new HashMap<>();
        count = 0;

        dfs(root , 0 , targetSum);
        return count;
    }

    private void dfs(TreeNode root , long prefixSum , int targetSum){
        if(root == null) return;

        prefixSum += root.val;

        if(targetSum == prefixSum){
            count++;
        }

        count += map.getOrDefault(prefixSum - targetSum, 0);

        map.put(prefixSum , map.getOrDefault(prefixSum , 0) + 1);
        dfs(root.left , prefixSum , targetSum);
        dfs(root.right , prefixSum , targetSum);

        map.put(prefixSum , map.get(prefixSum) - 1);
    }
}
