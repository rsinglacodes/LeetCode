class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
        int ans=arr[0];
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
            int newmin = Math.min(arr[i],Math.min(arr[i]*max,arr[i]*min));
            int newmax= Math.max(arr[i],Math.max(arr[i]*max,arr[i]*min));
            max = newmax;
            min=newmin;
            ans=Math.max(max,ans);
        }
        return ans;
    }
}