import java.util.Scanner;

public class Dowhileloop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char choice;
            int totalCost = 0;
            
            System.out.println("Welcome to RegisResto!");
            
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Pirawu - 3k");
                System.out.println("2. Sambusa - 1k");
                System.out.println("3. Juice - 2k");
                
                System.out.print("Enter your choice (1-3): ");
                int option = scanner.nextInt();
                
                int cost = (option == 1) ? 3000 : (option == 2) ? 1000 : (option == 3) ? 2000 : 0;
                totalCost += cost;
                
                System.out.println("You have ordered item " + option + ".");
                
                System.out.print("Do you want to order more? (y/n): ");
                choice = scanner.next().charAt(0);
                
            } while (choice == 'y' || choice == 'Y');
            
            System.out.println("\nThank you for using the Food Ordering System!");
            System.out.println("Total cost of your order: " + totalCost + "k");
        }
    }
}