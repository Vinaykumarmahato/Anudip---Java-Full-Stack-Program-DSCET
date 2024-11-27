import java.util.Scanner;

public class SquareCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();

        double perimeter = 4 * side;   
        double area = side * side;    

        System.out.println("For a square with side length " + side + ":");
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

        scanner.close();
    }
}
