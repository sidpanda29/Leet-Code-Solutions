class Solution {
    public boolean hasSameDigits(String s) {

        // Create a recursive method

        // If the length is three, the middle character doesn't matter, so if
        // the ends are the same it returns true. This is the base case
        if(s.length() == 3) return s.charAt(0) == s.charAt(2);

        // now turn the string into an int to mutate it, which is why we use a SB for
        // temp instead of a regular string
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < s.length()-1; i++){
            int d = ((s.charAt(i) - '0') + (s.charAt(i + 1) - '0')) % 10;
            temp.append((char)('0' + d));
        }

        // Call recursion
        return hasSameDigits(temp.toString());
    }
}