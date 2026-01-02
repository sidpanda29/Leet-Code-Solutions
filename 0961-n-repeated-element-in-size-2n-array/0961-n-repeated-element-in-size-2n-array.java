class Solution {
    public int repeatedNTimes(int[] nums) {

        if(nums.length == 2) return nums[0];
        int n = (nums.length / 2) + 2;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j]) return nums[i];
            }
        }

        return 0;
    }
}