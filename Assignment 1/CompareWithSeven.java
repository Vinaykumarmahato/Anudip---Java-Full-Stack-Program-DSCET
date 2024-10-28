import java.util.Scanner;

public class CompareWithSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 7) {
            System.out.println("The number is greater than 7.");
        } else if (number < 7) {
            System.out.println("The number is less than 7.");
        } else {
            System.out.println("The number is equal to 7.");
        }
        sc.close();
    }
}
