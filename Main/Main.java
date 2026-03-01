package Java.Main;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        second p = new second();
        

        while (p.continueCalculator) {
            
            System.out.println("\n====Basic Calculator====\n");
            System.out.println("ADDITION:       1 \nSUBTRACTION:    2 \nMULTIPLICATION: 3 \nDIVISION:       4 \nMODULOS:        5");
            System.out.print("Choose a sign(+, -, *, /, %): ");
            p.sign = sc.next().charAt(0);
            
            System.out.print("Enter a first number: ");
            p.num1 = sc.nextDouble();

            System.out.print("Enter a second number: ");
            p.num2 = sc.nextDouble();

            switch (p.sign) {
                case '+':
                    System.out.printf("%nResult: %.2f + %.2f = %.2f%n", p.num1, p.num2, p.num1 + p.num2);
                    break;
                case '-':
                    System.out.printf("%nResult: %.2f - %.2f = %.2f%n", p.num1, p.num2, p.num1 - p.num2);
                    break;
                case '*':
                    System.out.printf("%nResult: %.2f * %.2f = %.2f%n", p.num1, p.num2, p.num1 * p.num2);
                    break;
                case '/':
                    if (p.num2 == 0) {
                        System.out.println("\nError: Cannot divide by zero.");
                    } else System.out.printf("%nResult: %.2f / %.2f = %.2f%n", p.num1, p.num2, p.num1 / p.num2);
                    break;
                case '%':
                    if (p.num2 == 0) {
                        System.out.println("\nError: Cannot divide by zero.");
                    } else System.out.printf("%nResult: %.2f % %.2f = %.2f%n", p.num1, p.num2, p.num1 % p.num2);
                    break;
                default:
                    System.out.println("Error. Choose a sign(+, -, *, /, %): ");
                    break;
            }

            System.out.println("\nDo you want to continue? (Y/N): \n");
            String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("n")) {
                    p.continueCalculator = false;
                    System.out.println("Thank you for using us!");
                    break;
                }
        }
        sc.close();
    }
}
