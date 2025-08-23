class Solution {
    public boolean checkXMatrix(int[][] grid) {
     int k=grid.length;
     int l=grid[0].length;
     int ctr=0;
     for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(i==j ||j==k-i-1){
                if(grid[i][j]==0){
                    return false;
                }
            }else{
                if(grid[i][j]!=0){
                    return false;
                }
            }
        }
     }
     return true;   
    }
}