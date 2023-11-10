/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author 20127
 */
import java.time.LocalDate;

public class CustomerProduct implements Record {
    private String customerSSN;
    private String productID;
    private LocalDate purchaseDate;

    public CustomerProduct(String customerSSN, String productID, LocalDate purchaseDate) {
        this.customerSSN = customerSSN;
        this.productID = productID;
        this.purchaseDate = purchaseDate;
    }

    public String getCustomerSSN() {
        return this.customerSSN;
    }

    public String getProductID() {
        return this.productID;
    }

    public LocalDate getPurchaseDate() {
        return this.purchaseDate;
    }

    public void setCustomerSSN(String customerSSN) {
        this.customerSSN = customerSSN;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String lineRepresentation() {
        return this.customerSSN + "," + this.productID + "," + this.purchaseDate.getDayOfMonth() + "-" + this.purchaseDate.getMonthValue() + "-" + this.purchaseDate.getYear();
    }

    @Override
    public String getSearchKey() {
        return this.customerSSN + "," + this.productID + "," + this.purchaseDate.getDayOfMonth() + "-" + this.purchaseDate.getMonthValue() + "-" + this.purchaseDate.getYear();
    }
}

