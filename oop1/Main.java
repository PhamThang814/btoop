package oop1;
import java.util.*;
public class Main {
	 List<Category> categories = new ArrayList<>();
     categories.add(new Category("Electronics"));
     categories.add(new Category("Clothing"));
     categories.add(new Category("Books"));

     ProductManager productManager = new ProductManager(categories);
     Scanner scanner = new Scanner(System.in);

     while (true) {
         System.out.println("1. Create new product");
         System.out.println("2. Delete product");
         System.out.println("3. Display product by ID");
         System.out.println("4. Display all products");
         System.out.println("5. Display products by category");
         System.out.println("6. Calculate total price of all products");
         System.out.println("0. Exit");

         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine(); // consume newline

         switch (choice) {
             case 1:
                 productManager.createProduct();
                 break;
             case 2:
                 System.out.print("Enter product ID to delete: ");
                 Long deleteProductId = scanner.nextLong();
                 productManager.deleteProduct(deleteProductId);
                 break;
             case 3:
                 System.out.print("Enter product ID to display: ");
                 Long displayProductId = scanner.nextLong();
                 productManager.displayProduct(displayProductId);
                 break;
             case 4:
                 productManager.displayAllProducts();
                 break;
             case 5:
                 System.out.print("Enter category name to display products: ");
                 String categoryName = scanner.nextLine();
                 productManager.displayProductsByCategory(categoryName);
                 break;
             case 6:
                 System.out.println("Total price of all products: " + productManager.calculateTotalPrice());
                 break;
             
             case 0:
                 System.out.println("Exiting the program.");
                 System.exit(0);
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     }
 }
}

