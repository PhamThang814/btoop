package oop1;

public class Product {
	Long id;
    String name;
    Double price;
    Integer quantity;
    Category category;

    public Product(Long id, String name, Double price, Integer quantity, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
}
