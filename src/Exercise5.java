import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three homework grades.");
        double Homework1 = in.nextDouble();
        double Homework2 = in.nextDouble();
        double Homework3 = in.nextDouble();
        System.out.println("Enter two quiz grades.");
        double Quiz1 = in.nextDouble();
        double Quiz2 = in.nextDouble();
        System.out.println("Enter one test grade.");
        double Test1 = in.nextDouble();

        double HomeworkGrade = (((Homework1+Homework2+Homework3) / 3) * 0.15);
        double QuizGrade = (((Quiz1+Quiz2) / 2) * 0.35);
        double TestGrade = (Test1 * 0.50);

        double TotalGrade = (HomeworkGrade+QuizGrade+TestGrade);

        System.out.printf("%.2f", TotalGrade);
        System.out.print("%");

    }
}

//Done