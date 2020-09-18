import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a temperature in Fahrenheit.");
        float Fahrenheit = in.nextFloat();
        double Celsius = (((Fahrenheit - 32) * 5) / 9);
        double Kelvin = ((((Fahrenheit - 32) * 5) / 9) + 273.15);


        System.out.printf("%,2f", Celsius);
        System.out.printf("%,2f", Kelvin);
    }
}

/*Fahrenheit to Celsius/kelvin
Format with commas and two decimal places
 */