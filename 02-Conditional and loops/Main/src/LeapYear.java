import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the year to be checked : ");
        int year = in.nextInt();




        if(((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0))
            System.out.println(year+" is Leap year");
        else
            System.out.println(year+" is not a leap year");
        
    }
}
