import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your hourly wage.");
        double Wage = in.nextDouble();
        System.out.println("Enter your hours from Monday to Sunday.");
        double Monday = in.nextDouble();
        double Tuesday = in.nextDouble();
        double Wednesday = in.nextDouble();
        double Thursday = in.nextDouble();
        double Friday = in.nextDouble();
        double Saturday = in.nextDouble();
        double Sunday = in.nextDouble();

        double totalHours = (Monday+Tuesday+Wednesday+Thursday+Friday+Saturday+Sunday);

        double paycheck = (totalHours * Wage);

        System.out.print("$");
        System.out.printf("%,.2f", paycheck);

    }
}

//Done