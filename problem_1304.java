class Solution {
    public int[] sumZero(int n) {
        int [] arr=new int[n];
        int i,j;
        if(n==1){
            arr[0]=0;
        }
        if(n%2==0){
            int c=1;
            for( i=0, j=n-1;i<n/2;i++,j--){
                arr[i]=-c;
                arr[j]=c;
                c+=2;
            }
        }
        else{
            int c=1;
            for( i=0,j=n-1;i<n/2;i++,j--){
                arr[i]=-c;
                arr[j]=c;
                c+=2;
            }
            arr[n/2]=0;
        }
        return arr;
    }
}
