class Solution {
    public int sumOfSquares(int[] nums) {
        int length=nums.length;
        int sum=0;
        for(int i=0;i<length;i++){
            if(length % (i+1) == 0){
                sum=sum + (nums[i] * nums[i]);
            }
        }return sum;
    }
}