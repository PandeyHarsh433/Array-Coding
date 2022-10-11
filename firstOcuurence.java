public class firstOcuurence {

    // Naive Solution

    // static int firstOc(int[] arr, int data) {
    // for(int i=0;i<arr.length;i++) {
    // if(arr[i]==data) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // Recursive code

    // static int firstOc(int[] arr,int low, int high, int data) {
    // int mid = (high+low)/2;
    // if(low>high)
    // return -1;
    // if(data>arr[mid]) {
    // firstOc(arr, mid+1, high, data);
    // }
    // else if(data<arr[mid]) {
    // firstOc(arr, low, mid-1, data);
    // }
    // else {
    // if(mid==0 || arr[mid-1]!=arr[mid]) {
    // return mid;
    // }
    // else {
    // firstOc(arr, low, mid-1, data);
    // }
    // }
    // return -1;
    // }

    // Iterative Code

    static int firstOcc(int arr[], int n, int x) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (x > arr[mid])
                low = mid + 1;

            else if (x < arr[mid])
                high = mid - 1;

            else {
                if (mid == 0 || arr[mid - 1] != arr[mid])
                    return mid;

                else
                    high = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 5, 5, 6, 67 };
        System.out.println(firstOcc(arr, 8, 5));
    }
}
