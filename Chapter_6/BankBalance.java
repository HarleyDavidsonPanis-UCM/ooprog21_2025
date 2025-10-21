import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        double balance;
        int response;
        int year = 1;
        final double INTEREST_RATE = 0.03; 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Initial Bank Balance: ");
        balance = scanner.nextDouble();   
        System.out.println("Do you want to see next year's balance?");
        System.out.print("Enter 1 for yes" );
        System.out.print(" or any numbers for no>> "); 
        response = scanner.nextInt();
        while (response == 1){
            balance = balance + balance * INTEREST_RATE;
            System.out.println("After year " + year + " at " + INTEREST_RATE + 
            " interest rate, balance is $" + balance);
            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any number for no>>");
            response = scanner.nextInt();
        }
    }
}
