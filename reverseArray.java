public class reverseArray {
    static int[] reverseArr(int[] arr) {
        int n = arr.length/2;
        for(int i=0;i<=n;i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 43, 5 };
        int[] arr = reverseArr(array);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
