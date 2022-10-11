public class lastOccurence {

    // Recursive code

    static int lastOcc(int arr[], int low, int high, int x, int n) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (x > arr[mid])
            return lastOcc(arr, mid + 1, high, x, n);

        else if (x < arr[mid])
            return lastOcc(arr, low, mid - 1, x, n);

        else {
            if (mid == n - 1 || arr[mid + 1] != arr[mid])
                return mid;

            else
                return lastOcc(arr, mid + 1, high, x, n);
        }
    }

    // Iterative Code

    // static int lastOcc(int arr[], int n, int x) {
    //     int low = 0, high = n - 1;

    //     while (low <= high) {
    //         int mid = (low + high) / 2;

    //         if (x > arr[mid])
    //             low = mid + 1;

    //         else if (x < arr[mid])
    //             high = mid - 1;

    //         else {
    //             if (mid == 0 || arr[mid + 1] != arr[mid])
    //                 return mid;

    //             else
    //                 low = mid + 1;
    //         }

    //     }

    //     return -1;
    // }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 5, 5, 6, 67 };
        System.out.println(lastOcc(arr, 0, 7, 5, 8));
    }
}
