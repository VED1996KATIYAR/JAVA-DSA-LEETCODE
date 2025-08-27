class Solution {
    public int[][] rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int k=0;k<matrix.length;k++){
            int sc=0;
            int en=matrix.length-1;
            while(sc<en){
                int tempo=matrix[k][sc];
                matrix[k][sc]=matrix[k][en];
                matrix[k][en]=tempo;
                sc++;
                en--;
            }
        }
        return matrix;
    }
}