import java.util.Scanner;

public class AvergaeN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how may numbers to be added ");
        int num = in.nextInt();
        int sum=0 , sum2=0;

        for(int i =1;i<=num;i++){
            sum = sum+i;

        }

        System.out.println(sum);

        while(num!=0) {
            sum2 = sum2 + num;
            num--;
        }
        System.out.println(sum2);
    }
}


