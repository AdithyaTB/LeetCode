class Solution {
    public int maxVowels(String s, int k) {
        int L = s.length();
        int[] vow = new int[L];
        for(int i=0 ; i < L ; i++){
            char ch = s.charAt(i);
            if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u'){
                vow[i] = 1;
            }
        }
        int l = 0 , r = 0 , sum = 0 , maxSum = Integer.MIN_VALUE;
            while( r < L ){
                sum += vow[r];
                if( r - l + 1 == k ){
                    maxSum = Math.max( maxSum , sum );
                    sum -= vow[l];
                    l++;
                }
                r++;
            }
            return maxSum;

    }
}
