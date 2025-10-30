class Solution {
    public int minNumberOperations(int[] target) {

        if(target.length == 1) return target[0];

        int counter = target[0];
        
        List<Integer> nums = new ArrayList<>();
        int[] zeros = new int[target.length];
        for(int i = 1; i < target.length; i ++){
            counter += Math.max(target[i] - target[i-1], 0);
        }

        return counter;
    }
}