import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the unit for which the bill has to be calculated ");
        float unit = in.nextFloat();
        double bill = 0.0;


        if(unit<200){
            bill = unit*1.2;
        } else if (unit>200) {
            bill = 100*1.2 + (unit-100)*2;
        }

        System.out.println("Bill amount to be paid on("+unit+") is "+bill);

    }
}
