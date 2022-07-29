import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);

        System.out.println("Please enter your marks");
        float marks = in.nextFloat();

        String grade = GradeCheck(marks);

        System.out.println("Your marks is "+marks+" and your grade is "+grade+" .");


    }

    public static String GradeCheck(float Marks){
        String grade = "AA";
        if(Marks>91 && Marks<100)
            grade = "AA";
        else if(Marks>81 && Marks<90)
            grade = "AB";
        else if(Marks>71 && Marks<80)
            grade = "BB";
        else if(Marks>61 && Marks<70)
            grade = "BC";
        else if(Marks>51 && Marks<60)
            grade = "CD";
        else if(Marks>41 && Marks<50)
            grade = "DD";
        else if (Marks<=40)
            grade = "Fail";

        return grade;
    }
}
