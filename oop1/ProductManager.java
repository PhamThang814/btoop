package oop1;
import java.util.*;
public class ProductManager {
	 private List<Product> products;
	    private List<Category> categories;

	    public ProductManager(List<Category> categories) {
	        this.products = new ArrayList<>();
	        this.categories = categories;
	    }
	    public void createProduct() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhap ten san pham: ");
	        String name = scanner.nextLine();

	        System.out.print("Nhap gia san pham: ");
	        Double price = scanner.nextDouble();

	        System.out.print("Nhap so luong san pham: ");
	        Integer quantity = scanner.nextInt();

	        System.out.print("Nhap danh muc san pham: ");
	        displayCategories();
	        int categoryIndex = scanner.nextInt();
	        Category selectedCategory = categories.get(categoryIndex);

	        Product product = new Product((long) (products.size() + 1), name, price, quantity, selectedCategory);
	        products.add(product);

	        System.out.println("San pham da them thanh cong!");
	    }
	    public void deleteProduct(Long productId) {
	        Product product = getProductById(productId);

	        if (product != null) {
	            products.remove(product);
	            System.out.println("Product deleted successfully!");
	        } else {
	            System.out.println("Product not found!");
	        }
	    }
	    public void displayProduct(Long productId) {
	        Product product = getProductById(productId);

	        if (product != null) {
	            displayProductDetails(product);
	        } else {
	            System.out.println("Product not found!");
	        }
	    }
	    public void displayAllProducts() {
	        for (Product product : products) {
	            displayProductDetails(product);
	        }
	    }

	    public void displayProductsByCategory(String categoryName) {
	        for (Product product : products) {
	            if (product.category.name.equalsIgnoreCase(categoryName)) {
	                displayProductDetails(product);
	            }
	        }
	    }

	    public Double calculateTotalPrice() {
	        Double totalPrice = 0.0;

	        for (Product product : products) {
	            totalPrice += product.price * product.quantity;
	        }

	        return totalPrice;
	    }

	    private void displayProductDetails(Product product) {
	        System.out.println("Product ID: " + product.id);
	        System.out.println("Product Name: " + product.name);
	        System.out.println("Product Price: " + product.price);
	        System.out.println("Product Quantity: " + product.quantity);
	        System.out.println("Product Category: " + product.category.name);
	        System.out.println("----------------------");
	    }

	    private Product getProductById(Long productId) {
	        for (Product product : products) {
	            if (product.id.equals(productId)) {
	                return product;
	            }
	        }
	        return null;
	    }

	    private void displayCategories() {
	        System.out.println("Categories:");
	        for (int i = 0; i < categories.size(); i++) {
	            System.out.println(i + ". " + categories.get(i).name);
	        }
	    }
}
