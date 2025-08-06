class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0,i;
        int [] arr=new int[nums.length];
        for(i=0;i<nums.length;i++){
            sum=sum+nums[i];
            arr[i]=sum;
        }
        return arr;
    }
}
