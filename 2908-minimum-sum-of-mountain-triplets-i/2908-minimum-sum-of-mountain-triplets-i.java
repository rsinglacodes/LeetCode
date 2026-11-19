class Solution {
    public int minimumSum(int[] nums) {       
        int sum=Integer.MAX_VALUE;

        for(int j=0;j<nums.length;j++){
            int left = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;

            for(int i=0;i<j;i++){
                left = Math.min(left,nums[i]);
            }
            
            for(int i=j+1;i<nums.length;i++){
                right = Math.min(right,nums[i]);
            }
            
            if(left<nums[j] && right<nums[j]){
                sum = Math.min(sum,left+nums[j]+right);
            }

        }

        return sum==Integer.MAX_VALUE ? -1:sum;
    }
}