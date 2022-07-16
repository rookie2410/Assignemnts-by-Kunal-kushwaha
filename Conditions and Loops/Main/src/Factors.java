import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number whose factors are to be checked");
        int num = in.nextInt();

        for(int i=1;i<=num;i++){
             if(num%i==0){
                System.out.println(i+" is factor of "+num);
            }
//            else {
//                System.out.println(i+" is not a factor of "+num);
//            }
        }

    }
}
