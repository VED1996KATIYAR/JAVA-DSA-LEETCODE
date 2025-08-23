class Solution {
    public int diagonalSum(int[][] mat) {
        int k=mat.length;
        int l=mat[0].length;
        int sum=0;
        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                if((i==j)||(j==k-i-1)){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}