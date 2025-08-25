class Solution {
    public boolean isPowerOfFour(int n) {
        return pp(n,0);
    }
    public boolean pp(int n,int p){
        long c=(long)Math.pow(4,p);
        if(n==c){
            return true;
        }
        if(c>n){
            return false;
        }
        return pp(n,p+1);
    }
    
}
