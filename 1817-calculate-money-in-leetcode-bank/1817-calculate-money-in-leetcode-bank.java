class Solution {
    public int totalMoney(int n) {
        int w = (n/7);
        int r = n % 7;
        int[] rem = {1, 2, 3, 4, 5, 6};
        int remSum = 0;
        int sevenSum = 0;
        for(int i = 0; i < r; i++){
            remSum += rem[i] + w;
        }
        for(int i = 0; i < w; i++){
            sevenSum += i;
        }
        return 7 * sevenSum + 28 * w + remSum;
    }
}