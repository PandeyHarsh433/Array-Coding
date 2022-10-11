public class maxConseqArray {
    // static int maxConsOne(int[] arr, int n) {
    // int res = 0;

    // for (int i = 0; i < n; i++) {
    // int curr = 0;
    // for (int j = i; j < n; j++) {
    // if (arr[j] == 1) {
    // curr++;
    // } else {
    // break;
    // }
    // }
    // res = Math.max(res, curr);
    // }
    // return res;
    // }

    
    static int maxConsOne(int[] arr, int n) {
        int res = 0, curr = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                curr = 0;
            } else {
                curr++;
                res = Math.max(curr, res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 0 };
        System.out.println(maxConsOne(arr, 6));
        int arr2[] = { 0, 1, 1, 1, 0, 1, 1 };
        System.out.println(maxConsOne(arr2, 7));
    }
}
