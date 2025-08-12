import java.util.*;
class Solution {
    public int arrangeCoins(int n) {
        return  (int) (Math.sqrt(8L * n + 1) - 1) / 2;
        
    }
}

//1+2+3+4.......x=n
//solve this and find value of x and return value of x directly
