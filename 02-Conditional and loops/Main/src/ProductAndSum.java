import java.util.Scanner;

public class ProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter and 2 integer of your choice");
        int first = in.nextInt();
        int second = in.nextInt();

        int product = first*second;
        int sum = first+second;

        int value = product - sum ;
        System.out.println("The subtraction of the product("+product+") and sum("+sum+") of "+first+" and "+second+" is "+value);
    }
}
