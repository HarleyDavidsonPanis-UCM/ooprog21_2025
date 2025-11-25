import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str1 = "Carmen";
        String str2;

        System.out.print("Enter your name >");
        str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println(str1 + " is equal to " + str2);
        }else
        System.out.print(str1 + " is not equal to" + str2);
    }
}
   