class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        // Because there is only two repeats, we can create an array of size two
        // to return as well as the value for which index we need to add to
        int[] ret = {0,0};
        int ind = 0;
        
        // Nested for loop. Sets the current value for which we are browsing the 
        // array for on the second pass through
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