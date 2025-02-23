package sorting;

public class sortingMethods {

    public void quickSort(int[] arr) {
        int start = 0, end = arr.length - 1;
        QuickSort(arr, start, end);
    }

    private static void QuickSort(int[] arr, int low, int high) {
        int start = low, end = high;
        int mid = (start + end) / 2;
        int pivot = arr[mid];
        while (start <= end) {
            while (arr[start] < pivot)
                start++;
            while (arr[end] > pivot)
                end--;
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        QuickSort(arr,low,end);
        QuickSort(arr, start, high);
    }

    public void BubbleSort(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void SelectionSort(int[] arr) {
        int l = arr.length;
        int minIndex;
        for (int i = 0; i < l; i++) {
            minIndex = i;
            for (int j = i + 1; j < l; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = i;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
