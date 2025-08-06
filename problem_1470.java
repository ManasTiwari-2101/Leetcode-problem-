class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr=new int[2*n];
        int i=0,j=n,c=0;
        for(i=0;i<2*n;i++){
            if(i%2==0){
                arr[i]=nums[c];
                c++;
            }
            else{
                arr[i]=nums[j];
                j++;
            }
        }
        return arr;
    }
}
