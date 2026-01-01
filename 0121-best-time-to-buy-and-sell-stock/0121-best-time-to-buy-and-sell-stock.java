class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        if(n == 0 || n == 1) return 0;

        int maxRet = 0;
        int minVal = prices[0];

        for(int i = 0; i < n; i++){
            maxRet = Math.max(maxRet, prices[i] - minVal);
            minVal = Math.min(minVal, prices[i]);
        }
        return maxRet;
    }
}