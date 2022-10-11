import java.util.*;
public class ques {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0 ; i<nums.length ; i++) {
            if(nums[i]>target) {
                continue;
            }
            else {
                for(int j = 0;j<nums[j];j++) {
                    int a = 0;
                    if((nums[i] + nums[j])==target) {
                        arr[a] = i;
                        arr[a+1] = j;
                        return arr;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("how many number you want to put in the pot?");
        int num = input.nextInt();
        int numbers[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println ("number" + i + ":");
            numbers[i] = input.nextInt();
        }
        
        int target = input.nextInt();
        System.out.println(twoSum(numbers,target));
        
    }
}