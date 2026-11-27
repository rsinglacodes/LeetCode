class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int minp=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minp){
                minp=prices[i];
            }
            if(prices[i]-minp >maxp){
                maxp=prices[i]-minp;
            }
        }
        return maxp;
    }
}