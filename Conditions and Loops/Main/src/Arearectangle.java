import java.util.Scanner;

public class Arearectangle {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the Rectangle");
        float length = in.nextFloat();
        float breadth = in.nextFloat();

        double Area = length*breadth;

        System.out.println("The area of Rectangle is "+Area);
    }

}
