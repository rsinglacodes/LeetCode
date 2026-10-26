class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j+=2){
                    ans.add(grid[i][j]);
                }
            }
            else{
                if(m%2!=0){
                    for(int j=m-2;j>=0;j-=2){
                        ans.add(grid[i][j]);
                    }
                }
                else{
                    for(int j=m-1;j>=0;j-=2){
                        ans.add(grid[i][j]);
                    }
                }
            }
        }

        return ans;
    }
}