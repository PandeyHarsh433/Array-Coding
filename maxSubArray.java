public class maxSubArray {
    static int maxSub(int[] arr, int n) {
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i; j < n; j++) {
                curr += arr[i];
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    static int maxSub2(int[] arr, int n) {
        int maxEnd = arr[0];
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            maxEnd = Math.max(maxEnd + arr[i], arr[i]);
            res = Math.max(res, maxEnd);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 3, -1, 2 };
        System.out.println(maxSub(arr, 5));
        System.out.println(maxSub2(arr, 5));
    }
}
