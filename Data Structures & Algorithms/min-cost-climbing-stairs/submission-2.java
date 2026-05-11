class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        
        return helper(n,cost,dp);
    }

    public int helper(int n, int []cost, int []dp){
        if(n<=1){
            return 0;
        }

        if(dp[n] != -1) return dp[n];

      dp[n] = Math.min(helper((n-1),cost,dp)+cost[n-1],helper((n-2),cost,dp)+cost[n-2]);
      return dp[n];
    }
}
