import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int firstNumber = in.nextInt();

        System.out.println("Enter the second number ");
        int secondNumber = in.nextInt();

        System.out.println("Please enter the operation to be performed ");
        char operator = in.next().charAt(0);

        if(operator == '+'){
            System.out.println(firstNumber+secondNumber);
        } else if (operator == '-') {
            System.out.println(firstNumber-secondNumber);
        } else if (operator == '*') {
            System.out.println(firstNumber*secondNumber);
        } else if (operator == '/') {
            System.out.println(firstNumber/secondNumber);
        }else{
            System.out.println("Please enter proper operator");
        }
    }


}
