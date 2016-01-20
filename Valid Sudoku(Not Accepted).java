public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] flag = new int[10];
        
        for(int i=0;i<10;i++){
            flag[i] = 0;
        }
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    flag[Character.getNumericValue(board[i][j])-1]++;
                }
            }
            
            for(int k=0;k<10;k++){
                if(flag[k] > 0) return false;
            }
        }
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i] != '.'){
                    flag[Character.getNumericValue(board[j][i])-1]++;
                }
            }
            
            for(int k=0;k<10;k++){
                if(flag[k] > 0) return false;
            }
        }
        
        for(int k=0;k<9;k++){
            if(k==0 || k==1||k==2){
                char[] temp = new char[9];
                int m =0;
                
                for(int i=0;i<3;i++){
                    for(int j=k*3; j<k*6;k++){
                       temp[m] = board[i][j];
                       m++;
                    }
                }
                
                for(int i=0;i<9;i++){
                    if(temp[i] != '.'){
                        flag[Character.getNumericValue(temp[i])-1]++;
                    }
                }
                 
                for(int n=0;n<10;n++){
                    if(flag[n] > 0) return false;
                }
                   
            }
            
            if(k==3 || k==4|| k==5){
                char[] temp = new char[9];
                int m =0;
                
                for(int i=3;i<6;i++){
                    for(int j=(k-3)*3; j<(k-3)*6;k++){
                       temp[m] = board[i][j];
                       m++;
                    }
                }
                
                for(int i=0;i<9;i++){
                    if(temp[i] != '.'){
                        flag[Character.getNumericValue(temp[i])-1]++;
                    }
                }
                 
                for(int n=0;n<10;n++){
                    if(flag[n] > 0) return false;
                }
            }
            
            if(k==6 || k==7||k==8){
                char[] temp = new char[9];
                int m =0;
                
                for(int i=0;i<3;i++){
                    for(int j=(k-6)*3; j<(k-6)*6;k++){
                       temp[m] = board[i][j];
                       m++;
                    }
                }
                
                for(int i=0;i<9;i++){
                    if(temp[i] != '.'){
                        flag[Character.getNumericValue(temp[i])-1]++;
                    }
                }
                 
                for(int n=0;n<10;n++){
                    if(flag[n] > 0) return false;
                }
            }
        }
        
        return true;
    }
}
