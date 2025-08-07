class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0,i;
        for(i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    c++;
                }
            }
        }
        return c;
    }
}
