import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number whose factorial is to be checked : ");
        int num = in.nextInt();

        int fact = Factorial(num);

        System.out.println("Factorial of "+num+" is "+fact);

    }

    public static int Factorial(int num){
        int value =1 ;

        if(num == 0)
            return value = 1;
        else if (num == 1)
            return value = 1;

        while(num!=0){
            value=value*num;
            num--;
        }

        return value;
    }
}
