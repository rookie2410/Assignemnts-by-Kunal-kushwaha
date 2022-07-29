import java.util.Arrays;
import java.util.Scanner;

public class PermutationBasedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int num = in.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i]= in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        permutate(arr);
    }

    static void permutate(int[] arr){
        int n = arr.length;
        int[] output = new int[n];

        for(int i =0;i<n;i++){
            output[i]=arr[arr[i]];
        }

        System.out.println(Arrays.toString(output));

    }
}
