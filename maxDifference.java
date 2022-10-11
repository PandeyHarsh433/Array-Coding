public class maxDifference {
    // static int maxDIff(int[] arr) {
    //     int max = 0;
    //     int maxInd = 0;
    //     int n = arr.length;

    //     for(int i=0;i<n;i++) {
    //         if(arr[i]>max) {
    //             max = arr[i];
    //             maxInd = i;
    //         }
    //     }

    //     int temp = max - arr[maxInd-1];

    //     for(int j =maxInd;j>=0;j--) {
    //         if((max - arr[j]) > temp) {
    //             temp = max - arr[j];
    //         }
    //     }
    //     return temp;
    // }

    static int maxDIff(int arr[]) {
        int n = arr.length;
        int res = arr[1]-arr[0];
        int min = arr[0];

        for(int j=0;j<n;j++) {
            res = Math.max(res,arr[j]-min);
            min = Math.min(min,arr[j]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,10,6,4,8,1};
        System.out.println(maxDIff(arr));

        int[] arr2 = {7,9,5,6,3,2};
        System.out.println(maxDIff(arr2));
    }
}
