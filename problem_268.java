class Solution {
    public int missingNumber(int[] nums) {
        int actual_sum=nums.length*(nums.length+1)/2;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int miss_no=actual_sum-sum;
        return miss_no;
    }
}
