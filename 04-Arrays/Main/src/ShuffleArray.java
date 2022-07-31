import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int num = in.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i]= in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        arr = shuffle(arr,num/2);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] output = new int[n*2];
        for(int i=0;i<n;i++){
            output[i*2] = nums[i];
            output[i*2+1] = nums[n+i];
        }
        return output;
    }

}
