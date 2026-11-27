class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int c=0;
        int sum=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int a = sum-k;
            if(map.containsKey(a)){
                c+=map.get(a);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            
        }

        return c;
    }
}