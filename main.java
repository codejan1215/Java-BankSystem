package Java;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int appetizer;

        System.out.println("---SIMPLE MENU SYSTEM---");
        System.out.println();
        System.out.println("1. Appetizer");
        System.out.println("2. Main Dish");
        System.out.println("3. Drinks");
        System.out.println("4. Desserts");
        System.out.print("Enter number (1-4): ");
        num = sc.nextInt();
        System.out.println();

        

        switch (num) {
            case 1:
                System.err.println("---Appetizer---");
                System.out.println("Here's our Appetizer!");
                System.out.println(" 1. Chicharon\n 2. Crakers\n 3. Biscuits");
                System.out.print("Enter number for Appetizer (1-3): ");
                appetizer = sc.nextInt();
                switch (appetizer) {
                    case 1:
                        System.out.println("Got it! What's on your mind next?");
                        break;
                    case 2: 
                        System.out.println("love it! What's on your mind next?");
                        break;
                    case 3: 
                        System.out.println("Got it! What's on your mind next?");
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("---Main Dish---");
                break;
            case 3:
                System.out.println("---Drinks---");
                break;
            case 4:
                System.out.println("---Desserts---");
                break;
            default: 
                System.out.println("Please try again.");
                break;
        }

        

        sc.close();
    }
}
