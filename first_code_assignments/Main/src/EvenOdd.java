import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter any number");
        int num = in.nextInt();

        if(num%2==0){
            System.out.println(num + "is Even number");
        }
        else{
            System.out.println(num + "is Odd number");
        }
    }
}
