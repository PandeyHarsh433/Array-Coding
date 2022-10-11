public class moveZeroToEnd {


    // static void zeroToEnd(int[] arr) {
    //     int n = arr.length;
    //     for(int i=0;i<n;i++) {
    //         if(arr[i]==0) {
    //             for(int j = i+1;j<n;j++) {
    //                 if(arr[j] != 0) {
    //                     int temp = arr[i];
    //                     arr[i] = arr[j];
    //                     arr[j] = temp;
    //                 }
    //             }
    //         }
    //     }
    // }
     
    
    static void zeroToEnd2 (int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,2,0,3,0,4,3};
        zeroToEnd2(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
