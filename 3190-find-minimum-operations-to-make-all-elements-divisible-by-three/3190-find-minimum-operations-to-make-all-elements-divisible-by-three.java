class Solution {
    public int minimumOperations(int[] nums) {
        // create a counter to return
        int counter = 0;
        int n = nums.length;

        // iterate through loop. If its a divisor of three, no change needed
        // otherwise add one in either direction to get to the closes multiple of 3
        for(int i = 0; i < n; i++){
            if(nums[i] % 3 == 0) continue;
            else counter ++;
        }
        return counter;
    }
}