class Solution {
    public int thirdMax(int[] arr) {

        long ma=Long.MIN_VALUE;
        long sma=Long.MIN_VALUE;
        long tma=Long.MIN_VALUE;

        for(int x:arr){
            if(x==ma || x==sma || x==tma){
                continue;
            }

            if(x>ma){
                tma=sma;
                sma=ma;
                ma=x;
            }
            else if(x>sma){
                tma=sma;
                sma=x;
            }
            else if(x>tma){
                tma=x;
            }
        }

        if(tma ==Long.MIN_VALUE){
            return (int)ma;
        }
        return (int)tma;
    }
}