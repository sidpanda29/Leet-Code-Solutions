class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        count = 0
        
        for i in range(len(nums)):
            count = i + 1
            while count < len(nums) - 1 and nums[i] + nums[count] != target:
                count = count + 1
            if nums[i] + nums[count] == target:
                return [i, count]
        return -1
