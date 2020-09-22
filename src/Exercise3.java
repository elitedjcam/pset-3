import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the height of a rectangle in inches.");
        float Height = in.nextFloat();
        System.out.println("Enter the width of a rectangle in inches.");
        float Width = in.nextFloat();
        double squareMillimeters = ((Height * Width) * 645.16);

        System.out.printf("%,.2f", squareMillimeters);
        System.out.print(" square millimeters");
    }
}

//Done