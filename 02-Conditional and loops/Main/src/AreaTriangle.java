import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Height and base of Triangle");
        float height = in.nextFloat();
        float base = in.nextFloat();

        double Area = height*base/2;
        System.out.println("Are of the Triangle is "+Area);
    }
}
