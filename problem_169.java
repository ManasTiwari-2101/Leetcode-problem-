class Solution {
    public int majorityElement(int[] nums) {
        int a=nums[0];
        int c=1;
        int i,t=nums.length/2;
        for(i=1;i<nums.length;i++){
            if(a==nums[i]){
                c++;
            }else{
                c--;
                if(c==0){
                    a=nums[i];
                    c=1;
                }
            }
        }
        if(c>=t){
            return a;
        }
        return a;
    }
}
