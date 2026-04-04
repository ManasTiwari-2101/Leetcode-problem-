class Solution {
    private Double[][] dp;
    public double soupServings(int n) {
        if(n>4800) return 1.0;
        int units=(int) Math.ceil(n/25.0);
        dp=new Double[units+1][units+1];
        return check(units,units);
    }
    private double check(int a,int b){
        if(a<=0 && b<=0) return 0.5;
        if(a<=0) return 1.0;
        if(b<=0) return 0.0;

        if (dp[a][b]!=null) return dp[a][b];

        double prob=0.25*(
            check(a-4,b)+check(a-3,b-1)+check(a-2,b-2)+check(a-1,b-3)
            );
        dp[a][b]=prob;
        return prob;

    }
}
