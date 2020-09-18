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


        System.out.println(perimeterInCentimeters + " centimeters");
    }
}
