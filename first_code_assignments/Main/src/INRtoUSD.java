import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the INR amount");
        float inrAmount = in.nextFloat();
        System.out.println(inrAmount + " in USD is "+inrAmount/79.32);
    }
}
