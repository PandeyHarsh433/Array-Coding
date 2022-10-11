public class findTripletSum {
    static int isPresent(int arr[], int sum) {
        int n = arr.length;
        int l = 0, h = n - 1;

        while (l <= h) {
            if (arr[l] + arr[h] == sum)
                return l;
            else if (arr[l] + arr[h] > sum)
                h--;
            else
                l++;
        }

        return 0;
    }

    static int isTriplet(int[] arr, int sum) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(isPresent(arr, sum-arr[i])==1) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 8, 9, 11, 12, 20, 30 };
        System.out.println(isTriplet(arr, 14));
    }
}
