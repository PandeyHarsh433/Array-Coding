public class RepeatingElement {
    static int elRepeat(int[] arr) {
        int n = arr.length;
        boolean[] arr1 = new boolean[n];
        for(int i=0;i<n;i++) {
            arr1[i] = false;
        }

        for(int i=0;i<n;i++) {
            if(arr1[arr[i]] == false) {
                arr1[arr[i]] = true;
            }
            else {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0,2,1,3,2,2};
        int arr2[] = {0,2,1,3,4,3,5,3};
        System.out.println(elRepeat(arr2));
        System.out.println(elRepeat(arr));
    }
}
