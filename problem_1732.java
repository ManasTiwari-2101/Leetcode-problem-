import java.util.Arrays;
class Solution {
    public int largestAltitude(int[] gain) {
        int [] alt=new int [gain.length+1];
        alt[0]=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
            alt[i+1]=sum;
        }
        int max = Arrays.stream(alt).max().getAsInt();
        return max;
    }
}
