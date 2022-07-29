import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the string : ");
        String input = in.next();
        String revinput = "";


        for(int i=input.length()-1;i>=0;i--){
            revinput = revinput + input.charAt(i);
        }
        System.out.println(revinput);

        if(input.equals(revinput))
            System.out.println("The enterted string is palindrome");
        else
            System.out.println("It is not palindrome");


    }
}
