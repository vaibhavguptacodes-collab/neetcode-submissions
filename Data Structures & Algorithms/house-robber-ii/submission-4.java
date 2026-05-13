class Solution {
    public int rob(int[] nums) {
    int n = nums.length;

    if(n==1) return nums[0];

    int dp1[] = new int[n+1];
     int dp2[] = new int[n+1];
    Arrays.fill(dp1,-1);
     Arrays.fill(dp2,-1);

        int case1 = helper(0,n-2,nums,dp1);
        int case2 = helper(1,n-1,nums,dp2);

        return Math.max(case1,case2);
    }

    public int helper(int i, int end, int []nums, int []dp){

        if(i>end)return 0;

        if(dp[i] != -1) return dp[i];

        int pick = nums[i] + helper(i+2,end,nums,dp);
        int notPick = helper(i+1,end,nums,dp);

        dp[i] = Math.max(pick,notPick);

        return dp[i];
    }
}
