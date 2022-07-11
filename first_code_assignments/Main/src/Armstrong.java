import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int numcopy = num;
        int temp = 0 , sum = 0;
        while(num!=0){
            temp = num%10;
            sum = sum + (temp*temp*temp);
            num = num/10;
            System.out.println(temp+" " +sum + " " + num);

        }
        if(sum == numcopy)
            System.out.println(sum+" is palindrome");
        else
            System.out.println(sum+" is not palindrome");

    }

}
