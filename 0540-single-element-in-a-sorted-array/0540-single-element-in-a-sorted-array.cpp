class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        int ans=nums[0];
        for(int i=1;i<nums.size();i++){
            ans=nums[i]^ans;
        }
        return ans;
        
    }
};