import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = in.nextInt();

        if(check(num)){
            System.out.println("Its Even ");
        }
        else
            System.out.println("Its Odd ");


        
    }

    public static boolean check(int N){
        boolean checkValue = true;
        if(N%2==0)
            checkValue = true;
        else if (N%2!=0)
            checkValue = false;

        return checkValue;
    }
}
