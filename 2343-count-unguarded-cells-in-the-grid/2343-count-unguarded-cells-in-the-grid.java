class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        
        // creating a board for the problem
        int[][] board = new int[m][n];
        
        // adding the walls to the board to start
        for(int i = 0; i < walls.length; i ++){
            board[walls[i][0]][walls[i][1]] = 1;
        }
        
        // initializing the index in which the guards will go
        int guardsY = 0;
        int guardsX = 0;
        boolean breakCond = false;

        // adding guard to the board
        for(int j = 0; j < guards.length; j ++){
            guardsY = guards[j][0];
            guardsX = guards[j][1];
            if(board[guardsY][guardsX] == -1 && (m == 1 || n == 1)) continue;
            board[guardsY][guardsX] = -1;

            // adding guards in each direction on the X axis to begin with
            while(guardsX < n-1 && board[guardsY][guardsX + 1] != 1){
                guardsX ++;
                board[guardsY][guardsX] = -1;
                if(guardsX + 1 < n-1 && board[guardsY][guardsX + 1] == 1){
                    guardsX = guards[j][1];
                    break;
                }
            }while(guardsX > 0 && board[guardsY][guardsX - 1] != 1){
                guardsX --;
                board[guardsY][guardsX] = -1;
                if(guardsX - 1 > 0 && board[guardsY][guardsX - 1] == 1){
                    guardsX = guards[j][1];
                    break;
                }
            }
            
            // resetting to the initial conditions then doing the same in the Y direction
            guardsY = guards[j][0];
            guardsX = guards[j][1];

            while(guardsY < m-1 && board[guardsY + 1][guardsX] != 1){
                guardsY ++;
                board[guardsY][guardsX] = -1;
                if(guardsY + 1 < m-1 && board[guardsY + 1][guardsX] == 1){
                    guardsY = guards[j][0];
                    break;
                }
            }while(guardsY > 0 && board[guardsY -1][guardsX] != 1){
                guardsY --;
                board[guardsY][guardsX] = -1;
                if(guardsY -1 > 0 && board[guardsY - 1][guardsX] == 1){
                    guardsY = guards[j][0];
                    break;
                }
            }
        }
        
        //iterating through and adding one to the counter whenever we see a guard position (-1)
        int counter = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 0) counter++;
            }
        }
        return counter;

    }
}