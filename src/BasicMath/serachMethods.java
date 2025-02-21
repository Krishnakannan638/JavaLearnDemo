package BasicMath;

public class serachMethods {
    public static int binarySearch(int[] arr, int target) {
        int start = 0, mid, end = arr.length - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid -1;
            } else if (arr[mid] < target) {
                start = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
