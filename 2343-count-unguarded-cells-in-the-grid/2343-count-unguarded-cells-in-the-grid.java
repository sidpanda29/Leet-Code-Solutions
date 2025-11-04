class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        
        int[][] board = new int[m][n];
        
        for(int i = 0; i < walls.length; i ++){
            board[walls[i][0]][walls[i][1]] = 1;
        }
        
        int guardsX = 0;
        int guardsY = 0;
        boolean breakCond = false;
        for(int j = 0; j < guards.length; j ++){
            guardsX = guards[j][0];
            guardsY = guards[j][1];
            if(board[guardsX][guardsY] == -1 && (m == 1 || n == 1)) continue;
            board[guardsX][guardsY] = -1;

            
            while(guardsY < n-1 && board[guardsX][guardsY + 1] != 1){
                guardsY ++;
                board[guardsX][guardsY] = -1;
                if(guardsY + 1 < n-1 && board[guardsX][guardsY + 1] == 1){
                    guardsY = guards[j][1];
                    break;
                }
            }while(guardsY > 0 && board[guardsX][guardsY - 1] != 1){
                guardsY --;
                board[guardsX][guardsY] = -1;
                if(guardsY - 1 > 0 && board[guardsX][guardsY - 1] == 1){
                    guardsY = guards[j][1];
                    break;
                }
            }
            
            guardsX = guards[j][0];
            guardsY = guards[j][1];

            while(guardsX < m-1 && board[guardsX + 1][guardsY] != 1){
                guardsX ++;
                board[guardsX][guardsY] = -1;
                if(guardsX + 1 < m-1 && board[guardsX + 1][guardsY] == 1){
                    guardsX = guards[j][0];
                    break;
                }
            }while(guardsX > 0 && board[guardsX -1][guardsY] != 1){
                guardsX --;
                board[guardsX][guardsY] = -1;
                if(guardsX -1 > 0 && board[guardsX - 1][guardsY] == 1){
                    guardsX = guards[j][0];
                    break;
                }
            }
        }
        int counter = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 0) counter++;
            }
        }
        return counter;

    }

    /*public int printBoard(int[][] board){
        int counter = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                //System.out.print(board[i][j] + ", ");
                if(board[i][j] == 0) counter++;
            }
            //System.out.println();
        }
        return counter;
    }*/
}