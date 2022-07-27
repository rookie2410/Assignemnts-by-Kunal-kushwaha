import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int num = in.nextInt();

        boolean ans = isPrime(num);
        System.out.println(ans);


    }

    public static boolean isPrime(int num){
        if(num<=1)
            return false;
        int c = 2;
        while(c*c<=num){
            if(num%c==0)
                return false;
            c++;
        }

        return true;


    }
}
