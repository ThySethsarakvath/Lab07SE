package Lab07;

import java.util.Scanner;

public class ProductManagementApp {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Product Management Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Product");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product discount (0-100): ");
                    double discount = scanner.nextDouble();
                    manager.addProduct(name, price, discount);
                    break;

                case 2:
                    System.out.print("Enter product name to remove: ");
                    String removeName = scanner.nextLine();
                    manager.removeProduct(removeName);
                    break;

                case 3:
                    System.out.print("Enter product name to update: ");
                    String oldName = scanner.nextLine();
                    System.out.print("Enter new product name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new product price: ");
                    double newPrice = scanner.nextDouble();
                    System.out.print("Enter new product discount (0-100): ");
                    double newDiscount = scanner.nextDouble();
                    manager.updateProduct(oldName, newName, newPrice, newDiscount);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}