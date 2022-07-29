import java.util.Scanner;

public class ContinuosSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the terms to be calculated , Press 0 to stop ");
        int num = in.nextInt();
        int positiveEvenSum =0 ,positiveOddSum =0, NegativeSum=0 ;
        while(num!=0){
            if(num>=0 && num%2==0)
                positiveEvenSum = positiveEvenSum + num;
            else if (num>=0 && num%2!=0){
                positiveOddSum+=num;
            } else if (num<0) {
                NegativeSum+=num;
            }

            num = in.nextInt();
        }
        System.out.println("Positive Even number sum : "+positiveEvenSum);
        System.out.println("Positive Odd number sum : "+positiveOddSum);
        System.out.println("Negative number sum : "+NegativeSum);

    }

}
