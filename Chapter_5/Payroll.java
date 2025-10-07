import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("What is your regular payrate? ");
        double Rate = scanner.nextDouble();

        Employee emp = new Employee(20, Rate, hoursWorked);

        double RegularPay = emp.getRegularPay();
        double OTPay = emp.getOvertimePay();

        System.out.println("Regular pay is: " + RegularPay);
        System.out.println("Overtime pay is: " + OTPay);
    }
}
