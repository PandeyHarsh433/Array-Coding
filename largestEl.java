public class largestEl {
    public static int findMax(int arr[]) {
        int max = 0;
        for(int i = 0 ; i<arr.length;i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,43,5};
        System.out.println(findMax(array)); 
    }
}
