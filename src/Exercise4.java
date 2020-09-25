import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the height of a rectangle in inches.");
        float Height = in.nextFloat();
        System.out.println("Enter the width of a rectangle in inches.");
        float Width = in.nextFloat();
        double perimeter = ((Height * 2) + (Width * 2));
        double perimeterInCentimeters = (perimeter * 2.54);

        System.out.print("Height: ");
        System.out.printf("%,.2f", Height);
        System.out.print("\nWidth: ");
        System.out.printf("%,.2f", Width);
        System.out.printf("\n%,.2f", perimeterInCentimeters);
        System.out.print(" centimeters");
    }
}

//Done