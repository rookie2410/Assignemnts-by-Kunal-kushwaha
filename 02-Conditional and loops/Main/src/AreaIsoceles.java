import java.util.Scanner;

//b * √(4a*a – b*b)/4

public class AreaIsoceles {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the same-length and diff-length of triangle ");
        double samelength = in.nextDouble();
        double diffside = in.nextDouble();

        double Area = (diffside*Math.sqrt((4*samelength*samelength)-(diffside*diffside)))/4;
        System.out.println("The are of Isosceles Triangle is "+Area);

    }
}
