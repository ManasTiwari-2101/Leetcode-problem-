class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int f=0;
            int t=nums[i];
            while(t>0){
                f++;
                t/=10;
            }
            if(f%2==0){
                c++;
            }
        }
        return c;
    }
}
