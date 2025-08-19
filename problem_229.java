import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int a=0,b=0;
        int c1=0,c2=0;
        int i,t=nums.length/3;
        List<Integer> res=new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(nums[i]==a){
                c1++;
            }else if(nums[i]==b){
                c2++;
            }else if(c1==0){
                a=nums[i];
                c1=1;
            }else if(c2==0){
                b=nums[i];
                c2=1;
            }else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int j:nums){
            if(j==a){
                c1++;
            }
            if(j==b){
                c2++;
            }
        }
        
        if(c1>t){
            res.add(a);
            if(a==b){
                return res; // to check if entire array is not made up of single element.
            }
        }
        if(c2>t){
            res.add(b);
        }
        return res;
    }
}
