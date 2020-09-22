import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.printf("%-8s: ", "Salary");
        double Salary = s.nextDouble();
        System.out.printf("%-8s: ", "401(k)");
        double k401 = s.nextDouble();
        System.out.printf("%-8s: ", "Federal");
        double fedTax = s.nextDouble();
        System.out.printf("%-8s: ", "State");
        double stateTax = s.nextDouble();

        double paycheck = (Salary * (1-k401/100) * (1-(stateTax+fedTax)/100))/24;

        System.out.printf("%n$%,.2f.", paycheck);
    }

}

//Done