class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        quickSort(arr);
        int n=arr.length;
        if(n<3){
            return true;
        }
        int d=arr[1]-arr[0];
        for(int i=2;i<n;i++){
            if(arr[i]-arr[i-1]!=d){
                return false;
            }
        }
        return true;
    }
    public static void quickSort(int[] arr) {
    quickSortHelper(arr, 0, arr.length - 1);
}

private static void quickSortHelper(int[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);

        quickSortHelper(arr, low, pi - 1);
        quickSortHelper(arr, pi + 1, high);
    }
}

private static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (arr[j] <= pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
}

}
