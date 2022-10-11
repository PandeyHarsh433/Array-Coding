public class searchInRotatedArray {

    static int search(int[] arr, int data) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (data == arr[mid]) {
                return mid;
            }
            if (arr[low] < arr[mid]) {

                if (data >= arr[low] && data < arr[mid]) {
                    high = mid - 1;
                } else
                    low = mid + 1;
            } else {
                if (data > arr[mid] && data <= arr[high]) {
                    low = mid + 1;
                } else
                    high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, 100, 1, 2 };
        System.out.println(search(arr, 1));
    }
}
