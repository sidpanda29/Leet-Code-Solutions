class Solution {
    public int countOperations(int num1, int num2) {
        // check base case
        if(num1 == 0 || num2 == 0) return 0;
        
        // counter to return
        int counter = 1;

        // conditionals
        while(num1 != num2 && num1 > 0 && num2 > 0){
            if(num1 > num2) num1 = num1 - num2;
            else num2 = num2 - num1;
            counter ++;
        }
        
        return counter;
    }
}