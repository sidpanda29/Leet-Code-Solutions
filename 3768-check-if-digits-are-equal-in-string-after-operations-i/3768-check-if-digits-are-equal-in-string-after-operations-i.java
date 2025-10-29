class Solution {
    public boolean hasSameDigits(String s) {
        if(s.length() == 3) return s.charAt(0) == s.charAt(2);

        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < s.length()-1; i++){
            int d = ((s.charAt(i) - '0') + (s.charAt(i + 1) - '0')) % 10;
            temp.append((char)('0' + d));
        }

        return hasSameDigits(temp.toString());
    }
}