import java.util.Scanner;

public class UserInputMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers to get the max");
        int num = in.nextInt();
        int max =num;

        while(num!=0){
//            System.out.println("max is "+max);
            num = in.nextInt();
            if(max<num)
                max=num;

        }
        System.out.println("max is "+max);

    }
}
