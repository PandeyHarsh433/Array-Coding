import java.util.Hashtable;

public class frequencyOfEl {
    static void findFreq(int[] arr) {
        int n = arr.length;
        Hashtable<Integer, Integer> tab = new Hashtable<>();

        for(int i=0;i<n;i++) {
            if(tab.containsKey(arr[i])) {
                int count = tab.get(arr[i]);
                count++;
                tab.put(arr[i], count);
            }
            else {
                tab.put(arr[i], 1);
            }
        }
        System.out.println(tab);
    }
    public static void main(String[] args) {
        int[] arr = {10,10,10,25,30,30};
        findFreq(arr);
    }
}
