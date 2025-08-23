class Solution {
    public int countNegatives(int[][] grid) {
        int row=grid.length;
        int columns=grid[0].length;
        int ctr=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                if(grid[i][j] < 0){
                    ctr+=1;
                }
            }
        }
        return ctr;
    }
}