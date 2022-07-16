import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of circle");
        float rad = in.nextFloat();
        double Area = 3.14159*(rad*rad);
        System.out.println("The Are of circle is "+Area     );


    }
}
