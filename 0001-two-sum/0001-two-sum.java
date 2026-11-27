class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        int ans[] = new int[2];
        for(int i=0;i<n;i++){
            int a =target - nums[i];
            if(map.containsKey(a)){
                ans[0]=map.get(a);
                ans[1]=i;
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}