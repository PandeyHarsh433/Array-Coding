public class secondLarg {
    public static int secondEl(int[] arr) {
        int max = 0;
        for(int i = 0 ; i<arr.length;i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > b && arr[i] < max) {
                b = arr[i];
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 43, 5 };
        System.out.println(secondEl(array));
    }
}
