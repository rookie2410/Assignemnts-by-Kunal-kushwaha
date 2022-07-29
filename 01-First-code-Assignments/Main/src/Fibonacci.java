public class Fibonacci {
    public static void main(String[] args) {
        int a0 = 0;
        int a1 = 1;
        int a2 = 0;
        System.out.println(a0);
        System.out.println(a1);

        for(int i=0;i<=10;i++){
            a2 = a0+a1;
            System.out.println(a2);
            a0 = a1;
            a1 = a2;
        }


    }
}
