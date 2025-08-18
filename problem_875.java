import java.util.*;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1,max=Arrays.stream(piles).max().getAsInt();
        int ans=max;
        
        while(start<=max){
            int mid =start+(max-start)/2;
            long total_hours=calc(piles,mid);
            if(total_hours<=h){
                ans=mid;
                max=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;

    }
    public long calc(int [] arr,int mid){
        long h=0;
        for(int i : arr){
            h+=(i+mid-1)/mid;
        }
        return h;
    }
}
