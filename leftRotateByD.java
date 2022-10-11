public class leftRotateByD {
    // static void rotateByD(int[] arr, int d) {
    //     int n = arr.length;
    //     int temp[] = new int[d];

    //     for(int i=0;i<d;i++) {
    //         temp[i] = arr[i];
    //     }
    //     for(int i=d;i<n;i++) {
    //         arr[i-d] = arr[i];
    //     }
    //     for(int i=0;i<d;i++) {
    //         arr[n-d+i] = temp[i];
    //     }
    // }
    
    static void rotateByD(int arr[], int d) {
        int n = arr.length;

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    static void reverse(int[] arr, int low, int high) {
        while(low<high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotateByD(arr, 3);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
