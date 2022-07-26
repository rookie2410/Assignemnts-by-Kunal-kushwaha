import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 2 numbers to be added");
        int a = in.nextInt();
        int b = in.nextInt();

        int c = sum(a,b);
        System.out.println("The sum of "+a+" and "+b+" is : "+c);

    }

    public static int sum(int A, int B){
        return A +B;
    }
}
