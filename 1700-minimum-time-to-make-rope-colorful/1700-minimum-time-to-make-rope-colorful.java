class Solution {
    public int minCost(String colors, int[] neededTime) {
        
        // if the string is 0 or 1, there is no duplicate balloons, return original
        if(colors.length() <= 1) return 0;
    
        // Counter, compare start to final. Put the result into counter to be returned
        int counter = 0;
        int startIndex = 0;
        int finalIndex = 0;
        int max = 0;
        int n = colors.length();
        boolean maxTriggered = false;
        for(int i = 0; i < n; i ++){
            startIndex = i;
            finalIndex = i+1;
            while(finalIndex < n && colors.charAt(finalIndex) == colors.charAt(startIndex)){
                finalIndex ++;
            }
            
            max = neededTime[startIndex];
            for(int j = startIndex; j < finalIndex; j++){
                if(max < neededTime[j]) max = neededTime[j];
            }
            for(int j = startIndex; j < finalIndex; j++){
                if(max == neededTime[j] && maxTriggered == false) maxTriggered = true;
                else if(max != neededTime[j] || maxTriggered == true) counter += neededTime[j];
            }
            i = finalIndex - 1;
            maxTriggered = false;
        }

        return counter;

        /*
        Check the first set of Indexes, the first index will start at 0 then have a run.
        the next will start one after the last index ended.*/
    }
}