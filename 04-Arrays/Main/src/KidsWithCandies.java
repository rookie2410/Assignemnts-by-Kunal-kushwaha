import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KidsWithCandies {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int num = in.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        List<Boolean> output = new ArrayList<Boolean>();
        output = kidsWithCandies(arr, num);
    }


        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> output = new ArrayList<Boolean>();
            int max = Maxcandies(candies);

            int i =0 ;
            while(i<candies.length){
                if(candies[i]+extraCandies >= max)
                    output.add(true);
                else
                    output.add(false);

                i++;
            }
            return output;
        }

        public static int Maxcandies(int[] candies){
            int max=candies[0];

            for(int i = 0;i<candies.length;i++){
                if(candies[i]>max)
                    max=candies[i];
            }
            return max;
        }
    }

