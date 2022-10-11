public class squareRoot {
    static int findRoot(int n) {
        int low = 1, high = n, res = -1;
        while(low<=high) {
            int mid = (low+high)/2;
            int msq = mid*mid;

            if(msq == n) {
                return mid;
            }
            else if(msq>n) {
                high = mid-1;
            }
            else {
                low = mid+1;
                res = mid;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(findRoot(80));
    }
}
