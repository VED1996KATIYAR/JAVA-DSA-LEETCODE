class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        int index=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid!=0 && mid!=arr.length-1 && arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                index=mid;
                break;
            }else if(mid!=arr.length-1 && arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if(index==-1){
            return 1;
        }else{
            return index;
        }
    }
}