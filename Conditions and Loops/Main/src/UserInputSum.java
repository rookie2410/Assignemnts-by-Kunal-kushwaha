import java.util.Scanner;

public class UserInputSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = in.nextInt();
        int sum=0;
        while(num!=0){
            sum=sum+num;
            System.out.println("Sum of previous numbers are "+sum);
            num = in.nextInt();

        }

    }
}
