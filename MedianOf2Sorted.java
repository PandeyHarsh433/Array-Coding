public class MedianOf2Sorted {
    static int calMedian(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] arr3 = new int[m+n];

        for(int i=0;i<m;i++) {
            arr3[i] = arr1[i];
        }
        for(int j=0;j<n;j++) {
            while(arr2[j]>=arr3[j]) {
                
            }
        }
    }
}
