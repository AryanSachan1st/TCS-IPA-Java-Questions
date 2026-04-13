package Coding15Marks.Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Product {
    private String prodId, prodName, category;
    private double price;
    private int stock;

    // constructor
    public Product(String prodId, String prodName, String category, double price, int stock) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    // setters
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    // getters
    public String getProdId() {
        return this.prodId;
    }
    public String getProdName() {
        return this.prodName;
    }
    public String getCategory() {
        return this.category;
    }
    public double getPrice() {
        return this.price;
    }
    public int getStock() {
        return this.stock;
    }

    // methods
    public double applyDiscount(String targetCategory, int discPercent) {
        if (this.category.equalsIgnoreCase(targetCategory) && this.stock > 50) {
            return this.price - (this.price * discPercent)/100.0;
        }
        return this.price;
    }
}

public class Solution9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of products: ");
        int numProds = sc.nextInt();
        sc.nextLine();

        List<Product> products = new ArrayList<>();
        
        for (int i=0; i<numProds; i++) {
            System.out.print("Enter prodId: ");
            String prodId = sc.nextLine();

            System.out.print("Enter product name: ");
            String prodName = sc.nextLine();

            System.out.print("Enter product category: ");
            String category = sc.nextLine();

            System.out.print("Enter product price: ");
            double prodPrice = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter product stocks: ");
            int stocks = sc.nextInt();
            sc.nextLine();

            Product product = new Product(prodId, prodName, category, prodPrice, stocks);
            products.add(product);
        }

        System.out.print("Enter target category: ");
        String targetCategory = sc.nextLine();

        TreeMap<Double, Product> treeMap = new TreeMap<>();

        for (Product product: products) {
            double discPrice = product.applyDiscount(targetCategory, 15);
            if (product.getPrice() != discPrice) {
                treeMap.put(discPrice, product);
            }
        }

        for (Map.Entry<Double, Product> entry: treeMap.entrySet()) {
            System.out.println(entry.getValue().getProdId() + " " + entry.getValue().getProdName() + " " + entry.getKey());
        }
        sc.close();
    }
}
