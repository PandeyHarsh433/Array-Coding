public class searchInInfiniteArray {
    public static int findEL(int arr[],int high,int low, int data) {
        int mid = low + (high - low)/2;

        if(low>high)
        return -1;

        if(arr[mid]==data) {
            return mid;
        }

        if(arr[mid]>data) {
            return findEL(arr, mid-1, low, data);
        }
        else if(arr[mid]<data) {
            return findEL(arr, high, mid+1, data);
        }
        return -1;
    }


    // static int search(int arr[], int data) {
    //     int i =0;
    //     while(true) {
    //         if(arr[i]==data)
    //         return i;
    //         else if(arr[i]>data)
    //         return -1;
            
    //         i++;
    //     }
    // } 

    

    static int search(int arr[], int data) {
        if(arr[0]==data) 
        return 0;
        int i =1;
        while(arr[i]<data) {
            i=i*2;
        }if(arr[i]==data)
        return i;

        return findEL(arr, i, i/2+1, data);

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 40, 50};
		int x = 4;
        System.out.println(search(arr, x));

    }
}
