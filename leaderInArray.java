public class leaderInArray {


    // static void findLeaders(int[] arr) {
    //     for(int i=0;i<arr.length;i++) {
    //         int a = 0;
    //         for(int j=i;j<arr.length;j++) {
    //             if(arr[j]>arr[i]) {
    //                 a = 1;
    //             }
    //         }
    //         if(a == 0) {
    //             System.out.print(arr[i] + " ");
    //         }
    //         a--;
    //     }
    // }


    static void findLeaders(int[] arr) {
        int n = arr.length;
        int curr_ldr = arr[n-1];
        System.out.print(curr_ldr + " ");

        for(int i=n-1;i>=0;i--) {
            if(curr_ldr<arr[i]) {
                curr_ldr = arr[i];
                System.out.print(curr_ldr + " ");
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {7,10,4,3,6,5,2};
        int[] arr2 = {10,20,30};
        findLeaders(arr);
        System.out.println();
        findLeaders(arr2);
    }
}
