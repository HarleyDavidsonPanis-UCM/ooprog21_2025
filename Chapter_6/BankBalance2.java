import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        double balance;
        int response;
        int year=1;
        final double INTEREST_RATE = 0.03; 
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Initial Bank Balance:");
        balance = scanner.nextDouble();
        scanner.nextLine();  
        do{
            balance = balance + balance *INTEREST_RATE;
            System.out.println("After year " + year + " at " + INTEREST_RATE + 
            " interest rate, balance is $" + balance);
            year = year + 1;
            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any number for no>>");
            response = scanner.nextInt();
        }while(response == 1);
    }
}
