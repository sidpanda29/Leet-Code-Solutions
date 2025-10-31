class Solution {
    public int lengthOfLongestSubstring(String s) {
        int counter = 0;
        int currIndex = 0;
        int finalIndex = 1;
        String temp = "";
        while(currIndex < s.length()){
            if(finalIndex > s.length()) break;
            if(!temp.contains(s.substring(finalIndex-1, finalIndex))) {
                temp = temp + s.substring(finalIndex-1,finalIndex);
                if(temp.length() > counter) counter = temp.length();
                finalIndex ++;
            } else {
                temp = "";
                currIndex ++;
                finalIndex = currIndex + 1;
            }          
        }
        return counter;
    }
}