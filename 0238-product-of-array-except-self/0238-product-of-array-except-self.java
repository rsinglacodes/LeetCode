class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int lprod =1;
        int rprod=1;
        ans[0]=lprod;
        for(int i=1;i<nums.length;i++){
            lprod*=nums[i-1];
            ans[i]=lprod;
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=rprod;
            rprod*=nums[i];
        }
        return ans;
    }
}