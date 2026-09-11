class Solution {
    public int longestConsecutive(int[] arr) {
        int n= arr.length;

        if(n==0) return 0;

        Arrays.sort(arr);
        int max=1;
        int c=1;
        for(int right=1;right<n;right++){
            if (arr[right] == arr[right - 1]) {
                continue;
            }
            if(arr[right-1]+1==arr[right]){
                c++;
            }
            else{
                c=1;
            }

            max=Math.max(max,c);
        }
        return max;
    }
}