import java.util.*;
public class deleteDuplicate {
    static void dd(){
        int arr[] = new int[50];
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        
        for(int i = 0; i<arr.length;i++) {
            if(ht.containsKey(arr[i])) {
                
            }
            ht.put(arr[i],0);
        }
    }
}