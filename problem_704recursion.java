class Solution {
    public int search(int[] nums, int target) {
       return binary(nums,target,0,nums.length-1);
    }
    public int binary(int [] arr,int target,int start,int end){
        int mid=start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return binary(arr,target,start,mid-1);
        }
        return binary(arr,target,mid+1,end);
    }
}
