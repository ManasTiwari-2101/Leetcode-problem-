class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        double r=Math.log(n)/Math.log(3);
        if(Math.abs(r - Math.round(r)) < 1e-10){
            return true;
        }else{
            return false;
        }
        
    }
}
