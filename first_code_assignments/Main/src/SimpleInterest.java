import java.security.Principal;
import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        System.out.println("Welcome to Simple Interst calculator");
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter Principle amount");
        int principle = in.nextInt();
        System.out.println("Enter the interst rate");
        float interest = in.nextFloat();
        System.out.println("The time period ?");
        int time = in.nextInt();

        float TotalAmount ;
        TotalAmount = principle+((interest*time*principle)/100);

        System.out.println("Total interest is "+TotalAmount);
    }
}
