public class count1s {
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

    static int numOf1s(int[] arr, int n) {
        int first = firstOcc(arr, n, 1);
        if(first==-1) {
            return 0;
        }
        else {
            return n-first;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,1};
        int[] arr2 = {0,0,0,0};
        int[] arr3 = {1,1,1,1,1};
        System.out.println(numOf1s(arr, 7));
        System.out.println(numOf1s(arr2, 4));
        System.out.println(numOf1s(arr3, 5));
    }
}
