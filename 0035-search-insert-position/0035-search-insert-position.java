class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                index=mid;
                break;
            }else if(nums[mid]<target)
                {
                    start=mid+1;
                    index=start;

            }else{
                end=mid-1;
                index=start;
            }
        }
        return index;
    }
}