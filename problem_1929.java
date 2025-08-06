class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] arr=new int[2*nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++){
            arr[c]=nums[i];
            c++;
        }
        for(int j=0;j<nums.length;j++){
            arr[c]=nums[j];
            c++;
        }
        return arr;
    }
}
