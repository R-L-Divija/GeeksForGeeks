class Solution {

    static int count = 0;

    static int inversionCount(int arr[]) {
        count = 0;
        mergeSort(arr, 0, arr.length - 1);
        return count;
    }

    static void mergeSort(int arr[], int left, int right) {

        if(left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int arr[], int left, int mid, int right) {

        int temp[] = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= right) {

            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } 
            else {
                temp[k++] = arr[j++];
                count = count + (mid - i + 1);
            }
        }

        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= right) {
            temp[k++] = arr[j++];
        }

        for(int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }
}