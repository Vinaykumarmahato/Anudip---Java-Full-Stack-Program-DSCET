import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 'C' to convert Celsius to Fahrenheit or 'F' to convert Fahrenheit to Celsius: ");
        char choice = scanner.next().charAt(0);

        if (choice == 'C' || choice == 'c') {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
        } else if (choice == 'F' || choice == 'f') {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
