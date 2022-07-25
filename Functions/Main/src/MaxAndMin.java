import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int firstNumber = in.nextInt();

        System.out.print("Enter the Second number : ");
        int secondNumber = in.nextInt();

        System.out.print("Enter the Third number : ");
        int thirdNumber = in.nextInt();

        int max = Max(firstNumber,secondNumber,thirdNumber);

        int min = Min(firstNumber,secondNumber,thirdNumber);

        System.out.println(max +" "+min);
    }

    public static int Max(int A , int B , int C){
        int max ;
        if(A>B) {
            if(A>C)
                max=A;
            else
                max = C;
        }
        else
            if(B>C)
                max=B;
            else
                max=C;


        return max;
    }

    public static int Min(int A , int B , int C){
        int min ;
        if(A<B) {
            if(A<C)
                min=A;
            else
                min = C;
        }
        else
        if(B<C)
            min=B;
        else
            min=C;
        return min;
    }
}
