import java.util.Scanner;

public class Fibo2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Which fibonacci number you are looking for ?");
        int num = in.nextInt();

        int a0 = 0 , a1 = 1;
        System.out.print(a0 +" "+a1+" ");
        int temp , i=2;

        while(i<=num){
            temp = a0+a1;
            System.out.print(temp+" ");
            a0 = a1;
            a1=temp;
            i++;
        }




    }
}
