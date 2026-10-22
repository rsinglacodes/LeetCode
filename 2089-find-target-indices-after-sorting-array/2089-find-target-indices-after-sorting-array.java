class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ans= new ArrayList<>();
        int count=0;
        int lessthan=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }
            if(nums[i]<target){
                lessthan++;
            }
        }
        for(int i=0;i<count;i++){
            ans.add(lessthan + i);
        }
        return ans;
    }
}