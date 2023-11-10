/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;
import Frontend.FileNames;

/**
 *
 * @author 20127
 */
import java.time.LocalDate;

public class EmployeeRole {
    private ProductDatabase productsDatabase = new ProductDatabase(FileNames.PRODUCT_FILENAME);
    private CustomerProductDatabase customerProductDatabase = new CustomerProductDatabase(FileNames.CUSTOMERPRODUCT_FILENAME);

    public EmployeeRole() {
    }

    public void addProduct(String productID, String productName, String manufacturerName, String supplierName, int Quantity, float price) {
        Product p = new Product(productID, productName, manufacturerName, supplierName, Quantity, price);
//        if (this.productsDatabase.contains(productID)) {
//            ((Product)this.productsDatabase.getRecord(productID)).setQuantity(((Product)this.productsDatabase.getRecord(productID)).getQuantity() + Quantity);
//        } else {
//            this.productsDatabase.insertRecord(p);
//        }
        this.productsDatabase.insertRecord(p);
        //this.productsDatabase.SaveToFile();
    }

    public Product[] getListOfProducts() {
        int size = this.productsDatabase.returnAllRecords().size();
        Product[] products = new Product[size];

        for(int i = 0; i < size; i++) {
            products[i] = (Product)(this.productsDatabase.returnAllRecords().get(i));
        }

        return products;
    }

    public CustomerProduct[] getListOfPurchasingOperations() {
        int size = this.customerProductDatabase.returnAllRecords().size();
        CustomerProduct[] customerProducts = new CustomerProduct[size];

        for(int i = 0; i < size; ++i) {
            customerProducts[i] = (CustomerProduct)this.customerProductDatabase.returnAllRecords().get(i);
        }

        return customerProducts;
    }

    public boolean purchaseProduct(String customerSSN, String productID, LocalDate purchaseDate) {
        Product product = ((Product)this.productsDatabase.getRecord(productID));
        if(product == null)
            return false;
        int quantity = product.getQuantity();
        if (quantity != 0 && this.productsDatabase.contains(productID)) {
            CustomerProduct customerProduct = new CustomerProduct(customerSSN, productID, purchaseDate);
            ((Product)this.productsDatabase.getRecord(productID)).setQuantity(quantity - 1);
            this.customerProductDatabase.insertRecord(customerProduct);
            return true;
        } else {
            return false;
        }
    }

    public double returnProduct(String customerSSN, String productID, LocalDate purchaseDate, LocalDate returnDate) {
        CustomerProduct customerProduct = new CustomerProduct(customerSSN, productID, purchaseDate);
        if (!purchaseDate.isAfter(returnDate) && this.productsDatabase.contains(productID) && this.customerProductDatabase.contains(customerProduct.getSearchKey()) && (returnDate.compareTo(purchaseDate) <= 14)) {
            int quantity = ((Product)this.productsDatabase.getRecord(productID)).getQuantity();
            ((Product)this.productsDatabase.getRecord(productID)).setQuantity(quantity + 1);
            this.customerProductDatabase.deleteRecord(customerProduct.getSearchKey());
            return (double)((Product)this.productsDatabase.getRecord(productID)).getPrice();
        } else {
            return -1.0;
        }
    }

    public void logout() {
        this.customerProductDatabase.SaveToFile();
        this.productsDatabase.SaveToFile();
    }
}
