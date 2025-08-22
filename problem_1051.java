class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        int []arr=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            arr[i]=heights[i];
        }
        mergeSort(arr);
        for(int j=0;j<heights.length;j++){
            if(arr[j]!=heights[j]){
                c++;
            }
        }
        return c;
    }
    public static void mergeSort(int[] arr) {
    if (arr == null || arr.length <= 1) return;

    // helper function for recursion
    mergeSortHelper(arr, 0, arr.length - 1);
}

private static void mergeSortHelper(int[] arr, int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;

        mergeSortHelper(arr, left, mid);
        mergeSortHelper(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }
}

private static void merge(int[] arr, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; i++) L[i] = arr[left + i];
    for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

    int i = 0, j = 0, k = left;

    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k++] = L[i++];
        } else {
            arr[k++] = R[j++];
        }
    }

    while (i < n1) arr[k++] = L[i++];
    while (j < n2) arr[k++] = R[j++];
}
      }
