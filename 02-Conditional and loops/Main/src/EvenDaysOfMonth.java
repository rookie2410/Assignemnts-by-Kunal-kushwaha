import java.util.Scanner;

public class EvenDaysOfMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count =0;
        for(int i = 1;i<=31;i++){
            if(i%2==0)
                count++;

        }
        System.out.println("Kunal is allowed to play for "+count+" in the month of August");
    }
}
