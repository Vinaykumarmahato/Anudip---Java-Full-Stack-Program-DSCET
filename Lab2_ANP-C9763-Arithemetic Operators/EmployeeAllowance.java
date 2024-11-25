import java.util.Scanner;

public class EmployeeAllowance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();

        double da = (12 * salary) / 100;  
        double hra = (13 * salary) / 100; 
        double pf = (15 * salary) / 100;  
        double gross = salary + da + hra - pf; 

        System.out.println("Employee Salary Details:");
        System.out.println("Basic Salary: " + salary);
        System.out.println("DA (12%): " + da);
        System.out.println("HRA (13%): " + hra);
        System.out.println("PF (15%): " + pf);
        System.out.println("Gross Salary: " + gross);

        scanner.close();
    }
}
