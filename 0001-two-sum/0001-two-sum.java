class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        int res[]=new int[2];


        for(int i=0;i<nums.length;i++){
            int a = target-nums[i];

            if(ans.containsKey(a)){
                res[0]=i;
                res[1]=ans.get(a);
            }
            ans.put(nums[i],i);
        }

        return res;
        
    }
}