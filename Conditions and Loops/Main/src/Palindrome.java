import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number to be checked ");
        int num = in.nextInt();

        int temp = num , temp2 = 0 , value = 0 ;

        while(temp!=0){
            temp2=temp%10;
            value = value*10 + temp2;
            temp=temp/10;
        }

        if(num==value)
            System.out.println(value+" is Palinfrome");
        else
            System.out.println(value+" is not palindrome");

    }
}
