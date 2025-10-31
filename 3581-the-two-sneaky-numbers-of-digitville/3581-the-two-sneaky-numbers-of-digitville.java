class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int ind = 0;
        int[] ret = {0,0};
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    ret[ind] = nums[i];
                    ind++;
                }
            }
        }
        return ret;

    }
}