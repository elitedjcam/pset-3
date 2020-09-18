import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three homework grades.");
        float Homework1 = in.nextFloat();
        float Homework2 = in.nextFloat();
        float Homework3 = in.nextFloat();
        System.out.println("Enter two quiz grades.");
        float Quiz1 = in.nextFloat();
        float Quiz2 = in.nextFloat();
        System.out.println("Enter one test grade.");
        float Test1 = in.nextFloat();

        double HomeworkGrade = ((Homework1+Homework2+Homework3) * 0.15);
        double QuizGrade = ((Quiz1+Quiz2) * 0.35);
        double TestGrade = ((Test1) * 0.50);



    }
}