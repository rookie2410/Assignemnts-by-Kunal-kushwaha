import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age to check if you are qualified to vote or not : ");
        int age = in.nextInt();

        if(CheckAge(age))
            System.out.println("You are qualified to vote ");
        else
            System.out.println("You are not qualified to vote ");
    }

    public static boolean CheckAge(int Age){
        boolean checkValue = true;
        if(Age>=18)
            checkValue = true;
        else if (Age<18)
            checkValue=false;

        return checkValue;
    }
}
