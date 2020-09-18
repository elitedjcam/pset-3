import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the height and width of a rectangle in inches.");
        float Height = in.nextFloat();
        float Width = in.nextFloat();
        double squareMillimeters = ((Height * Width) * 645.16);


        System.out.println(squareMillimeters + " square millimeters");
    }
}
