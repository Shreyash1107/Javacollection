package Application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product 
{
    private int pid;
    private String name;
    private int price;

    public Product() 
    {
        
    }

    public Product(int pid, String name, int price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPid() {
        return pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    // Implementing Comparator for sorting by name
    public static class SortByName implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

    // Implementing Comparator for sorting by price
    public static class SortByPrice implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return Integer.compare(p1.getPrice(), p2.getPrice());
        }
    }
}

public class ProductApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the Product Id:");
            int pid = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter the Product's Name:");
            String name = scanner.nextLine();
            System.out.println("Enter the Price of a Product:");
            int price = scanner.nextInt();
            productList.add(new Product(pid, name, price));
            System.out.println();
        }

        System.out.println("Display Product Information:");
        for (Product product : productList) {
            System.out.println(product.getPid() + " " + product.getName() + " " + product.getPrice());
        }

        // Sorting by name
        Collections.sort(productList, new Product.SortByName());
        System.out.println("Display Product Information after sorting through name:");
        for (Product product : productList) {
            System.out.println(product.getPid() + " " + product.getName() + " " + product.getPrice());
        }

        // Sorting by price
        Collections.sort(productList, new Product.SortByPrice());
        System.out.println("Display Product Information after sorting through price:");
        for (Product product : productList) {
            System.out.println(product.getPid() + " " + product.getName() + " " + product.getPrice());
        }
    }
}
