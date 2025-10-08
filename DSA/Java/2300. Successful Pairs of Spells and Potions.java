class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = potions.length;
        int[] res = new int[spells.length];

        for( int i = 0 ; i < spells.length ; i++ ){
            int spell = spells[i];
            int l = 0 , u = n - 1 ;
            while(l <= u){
                int m = l + ( u- l ) / 2;
                if((long) potions[m] * spell < success){
                    l = m + 1;
                }
                else{
                    u = m - 1;
                }
            }
            res[i] = n - l;
        }
        return res;
    }
}
