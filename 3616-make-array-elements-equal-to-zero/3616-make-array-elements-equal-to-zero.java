class Solution {
    public int countValidSelections(int[] nums) {
        
        //if(nums.length == 1 && nums[0] == 0) return 2;
        //if(nums.length == 1 && nums[0] != 0) return 0;
        int counter = 0;
        int curr = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                //System.out.println("Made it");
                //System.out.println(sumChecker(nums, i));
                counter += sumChecker(nums, i);
            }
        }
        return counter;
    }

    private int sumChecker(int[] nums, int index){
        int prevSum = 0;
        int nextSum = 0;
        int temp = 0;
        while(temp < index){
            prevSum += nums[temp];
            temp ++;
            //System.out.println(prevSum);
        }
        temp = nums.length - 1;
        while(temp > index){
            nextSum += nums[temp];
            temp --;
            //System.out.println(nextSum);
        }
        if(prevSum == nextSum) return 2;
        if(Math.abs(prevSum - nextSum) == 1) return 1;
        return 0;
    }
}