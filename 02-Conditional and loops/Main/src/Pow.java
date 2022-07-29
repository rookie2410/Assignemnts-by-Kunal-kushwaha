import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base number : ");
        int a = in.nextInt();
        System.out.print("Enter the Exponent number : ");
        int b = in.nextInt();

        double values = Math.pow(a,b);
        System.out.println("Values using Math.pow function : "+values);

        double value2 = pow(a,b);
        System.out.println("Values using static function : "+value2);

    }

    public static double pow(int m , int n){
        double value = 1;
        while(n!=0){
            value = value * m;
            n--;
        }

        return value ;
    }
}
