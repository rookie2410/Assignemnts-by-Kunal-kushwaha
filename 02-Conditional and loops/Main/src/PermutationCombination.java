import java.util.Scanner;

public class PermutationCombination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = in.nextInt();
        System.out.print("Enter the value of R: ");
        int R = in.nextInt();

        int ncr = fact(N)/(fact(R)*fact(N-R));
        System.out.println("The value of "+N+"C"+R+" is : "+ncr);

        int npr = fact(N)/fact(N-R);
        System.out.println("The value of "+N+"P"+R+" is : " +npr);

    }

    public static int fact(int N ){
        int fact = 1;
        while(N!=0){
            fact = fact * N ;
            N--;
        }
        return fact;
    }
}
