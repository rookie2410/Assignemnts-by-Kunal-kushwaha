import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to be  checked : ");
        int num = in.nextInt();
        int sum =0;
        for(int i =1;i<num;i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if(num==sum)
            System.out.println(sum+" is Perfect number");
        else
            System.out.println(sum+" is not Perfect number");




    }

    public static int factor(int N){
        int factor = 1;
        for(int i =1;i<=N;i++){
            if(N/i==0){

            }
        }


        return factor;

    }

}
