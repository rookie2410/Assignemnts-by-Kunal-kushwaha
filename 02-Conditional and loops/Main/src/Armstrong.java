import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to be checked : ");
        int num = in.nextInt();
        int temp = num ,temp2=0, sum =0;
        while(temp!=0){
            temp2=temp%10;
            sum = sum + (temp2 * temp2 * temp2);
            temp=temp/10;
        }

        if(sum==num)
            System.out.println("The number("+num+" ) is palindrome");
        else
            System.out.println("Not palindromw");

    }
}
