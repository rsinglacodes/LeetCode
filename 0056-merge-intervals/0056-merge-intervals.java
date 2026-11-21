class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();

        
        for(int i=0;i<intervals.length;i++){
            if(merged.isEmpty()){
                merged.add(intervals[0]);
            }
            int last[] = merged.get(merged.size()-1);
            int curr[]= intervals[i];

            if(last[1]>=curr[0]){
                curr[0]=last[0];
                curr[1]=Math.max(last[1],curr[1]);
                merged.remove(last);
                merged.add(curr);
            }
            else{
                merged.add(curr);
            }
            
        }

        return merged.toArray(new int[merged.size()][]);

    }
}