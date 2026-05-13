class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n==1) return nums[0];

        int case1 = helper(0,n-2,nums);
        int case2  = helper(1,n-1,nums);

        return Math.max(case1,case2);
    }

    public int helper(int start, int end , int []nums){

        int size = end-start+1;

        int dp[] = new int[size];

        dp[0] = nums[start];

        for(int i=1;i<size;i++){
            int pick = nums[start + i];

            if(i>1){
                pick += dp[i-2];
            }
            int notPick = dp[i-1];

            dp[i] = Math.max(pick,notPick);
        }

        return dp[size-1];
    }
}
