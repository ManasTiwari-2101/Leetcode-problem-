import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr=new ArrayList<>();
        int maxcandy=max(candies);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= maxcandy){
                arr.add(true);
            }else{
                arr.add(false);
            }
        }
        return arr;

        
    }
    int max(int [] arr){
        int l=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>l){
                l=arr[i];
            }
        }
        return l;
    }
}
