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

        System.out.print("Homework 1: ");
        System.out.printf("%,.2f", Homework1);
        System.out.print("\nHomework 2: ");
        System.out.printf("%,.2f", Homework2);
        System.out.print("\nHomework 3: ");
        System.out.printf("%,.2f", Homework3);
        System.out.print("\nQuiz 1: ");
        System.out.printf("%,.2f", Quiz1);
        System.out.print("\nQuiz 2: ");
        System.out.printf("%,.2f", Quiz2);
        System.out.print("\nTest 1: ");
        System.out.printf("%,.2f", Test1);
        System.out.print("\n");
        System.out.printf("\n%.2f", TotalGrade);
        System.out.print("%");

    }
}

//Done