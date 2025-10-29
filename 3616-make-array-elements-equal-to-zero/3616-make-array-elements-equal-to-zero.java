class Solution {
    public int countValidSelections(int[] nums) {
        
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                counter += sumChecker(nums, i);
            }
        }
        return counter;
    }

    // helper method to check the sum before and after and return right amount
    private int sumChecker(int[] nums, int index){
        int prevSum = 0;
        int nextSum = 0;
        int temp = 0;
        while(temp < index){
            prevSum += nums[temp];
            temp ++;
        }
        temp = nums.length - 1;
        while(temp > index){
            nextSum += nums[temp];
            temp --;
        }
        if(prevSum == nextSum) return 2;
        if(Math.abs(prevSum - nextSum) == 1) return 1;
        return 0;
    }
}