public class checkArraySort {
    static boolean isSort(int[] arr) {
        int a = 0;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]<=arr[i+1]) {
                a=1;
            }
        }
        if(a==1)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        int array[] = { 1,1, 2, 3, 4, 10,50,55,55 };
        System.out.println(isSort(array));
    }
}
