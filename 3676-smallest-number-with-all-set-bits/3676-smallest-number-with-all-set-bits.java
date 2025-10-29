class Solution {
    public int smallestNumber(int n) {
        // start by returning the Base Case
        if(n < 2) return n;

        // Check if the number gives you some
        if(n%2 == 0) n++;
        return (int) Math.pow(2, Math.ceil(Math.log(n)/Math.log(2))) - 1;
    }
}