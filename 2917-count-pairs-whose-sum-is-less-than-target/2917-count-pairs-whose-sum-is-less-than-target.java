class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int ctr=0;
        int[] arr = nums.stream().mapToInt(Integer::intValue).toArray();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])<target){
                    ctr+=1;
                }
            }
        }
        return ctr;
    }
}