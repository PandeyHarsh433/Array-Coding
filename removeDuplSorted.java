public class removeDuplSorted {
    static int lenDupl(int[] arr, int n) {
        int res = 1;
        for(int i=1 ;i<n;i++) {
            if(arr[i] != arr[res-1]) {
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int array[] = { 1,1, 2, 3, 4, 10,50,55,55 };
        System.out.println(lenDupl(array, 9));
    }
}
