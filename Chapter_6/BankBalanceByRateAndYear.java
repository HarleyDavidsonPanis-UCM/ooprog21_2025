import java.util.Scanner;
public class BankBalanceByRateAndYear {
   public static void main(String[] args) {
        double initialBalance;
    double balance;
    int year;
    double rate;
    final double InterestRateLow = 0.02;
    final double InterestRateHigh = 0.05;
    final double Increment = 0.01;
    final int MaxYears = 4;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter initial balance: ");
    initialBalance = scanner.nextDouble();
    scanner.nextLine();

    for(rate=InterestRateLow; rate<=InterestRateHigh; rate +=Increment){

        balance = initialBalance;
        System.out.println("\nWith an initial balance of $" + balance + 
        " at an interest rate of " + rate);
        for (year = 1; year <=MaxYears; year++){
            balance = balance + balance * rate;
            System.out.println("After year " + year + " balance is $" + balance);
        }
    }
   }
}
