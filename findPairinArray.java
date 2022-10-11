import java.util.*;

//   Two Pointer Approach

public class findPairinArray {
    static int isPresent(int arr[], int sum) {
        int n = arr.length;
        int l = 0, h = n - 1;

        while (l <= h) {
            if (arr[l] + arr[h] == sum)
                return 1;
            else if (arr[l] + arr[h] > sum)
                h--;
            else
                l++;
        }

        return 0;
    }

// Using HashSet JCF

    static void isPresWithHash(int[] arr, int sum) {
        HashSet<Integer> s  = new HashSet<Integer>();

        for(int i=0;i<arr.length;i++) {
            int temp = sum - arr[i]; 

            if (s.contains(temp)) { 
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")"); 
			} 
			s.add(arr[i]); 
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 8, 9, 11, 12, 20, 30 };
        System.out.println(isPresent(arr, 23));
        isPresWithHash(arr, 23);
    }
}
