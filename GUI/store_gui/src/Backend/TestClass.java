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

public class TestClass {
    private AdminRole admin = new AdminRole();
    private EmployeeRole employee = new EmployeeRole();

    public TestClass() {
    }

    public void testAdminRole() {
        EmployeeUser[] employees = this.admin.getListOfEmployees();
        EmployeeUser[] var2 = employees;
        int var3 = employees.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            EmployeeUser emp = var2[var4];
            this.admin.removeEmployee(emp.getSearchKey());
        }

        this.admin.logout();
        this.admin = new AdminRole();
        employees = this.admin.getListOfEmployees();
        if (employees.length != 0) {
            System.out.println("There is a problem in removing old employees from the employees file or arraylist");
        } else {
            this.admin.addEmployee("EMP-001", "Ahmed", "ahmed@email.com", "123 Street, Cairo", "+20123456789");
            this.admin.addEmployee("EMP-002", "Mohamed", "mohamed@email.com", "456 Boulevard, Giza", "+20198765432");
            this.admin.addEmployee("EMP-003", "Mariam", "mariam@email.com", "789 Avenue, Alexandria", "+20145678923");
            this.admin.addEmployee("EMP-004", "Hossam", "hossam@email.com", "101 Lane, Luxor", "+20132165498");
            this.admin.addEmployee("EMP-005", "Nour", "nour@email.com", "202 Drive, Aswan", "+20165432178");
            this.admin.logout();
            this.admin = new AdminRole();
            employees = this.admin.getListOfEmployees();
            if (employees.length != 5) {
                System.out.println("There is a problem in adding new employees to the employees file or arraylist");
            } else {
                this.admin.logout();
                System.out.println("You have passed the tests of admin role.\nHowever, there will be different tests during the discussion.\nMake sure that you have implemented all the requirements correctly");
            }
        }
    }

    private boolean addPurchaseOperation(CustomerProduct purchaseOperation) {
        return this.employee.purchaseProduct(purchaseOperation.getCustomerSSN(), purchaseOperation.getProductID(), purchaseOperation.getPurchaseDate());
    }

    public void testEmployeeRole() {
        Product[] oldProducts = this.employee.getListOfProducts();
        this.employee.addProduct("LPT-001", "MacBook Pro 16-inch", "Apple", "BestBuy", 2, 5000.0F);
        this.employee.addProduct("SMT-002", "Samsung Galaxy S22", "Samsung", "Amazon", 3, 1200.0F);
        this.employee.addProduct("GMC-003", "PlayStation 5", "Sony", "GameStop", 4, 500.0F);
        this.employee.addProduct("SPK-004", "Google Nest Audio", "Google", "Walmart", 1, 200.0F);
        this.employee.addProduct("WTCH-005", "Fitbit Versa 3", "Fitbit", "Target", 2, 150.0F);
        Product[] newProducts = this.employee.getListOfProducts();
        if (newProducts.length - oldProducts.length != 5) {
            System.out.println("There is a problem in adding new products to the products file or arraylist");
        } else {
            CustomerProduct[] oldOperations = this.employee.getListOfPurchasingOperations();
            String customer1 = "1111111";
            String customer2 = "2222222";
            String customer3 = "3333333";
            CustomerProduct oP1 = new CustomerProduct(customer1, "LPT-001", LocalDate.of(2023, 6, 1));
            CustomerProduct oP2 = new CustomerProduct(customer1, "LPT-001", LocalDate.of(2023, 6, 5));
            CustomerProduct oP3 = new CustomerProduct(customer2, "SPK-004", LocalDate.of(2023, 5, 11));
            CustomerProduct oP4 = new CustomerProduct(customer3, "SPK-004", LocalDate.of(2023, 5, 12));
            CustomerProduct oP5 = new CustomerProduct(customer3, "SPK-004", LocalDate.of(2023, 5, 20));
            boolean result = this.addPurchaseOperation(oP1);
            if (!result) {
                System.out.println("Purchase1: it is a valid purchase.\nHowever, your code refuses it. Fix your code!!!");
            } else {
                result = this.addPurchaseOperation(oP2);
                if (!result) {
                    System.out.println("Purchase2: it is a valid purchase.\nHowever, your code refuses it. Fix your code!!!");
                } else {
                    result = this.addPurchaseOperation(oP3);
                    if (!result) {
                        System.out.println("Purchase3: it is a valid purchase.\nHowever, your code refuses it. Fix your code!!!");
                    } else {
                        result = this.addPurchaseOperation(oP4);
                        if (result) {
                            System.out.println("Purchase4: it is an invalid purchase.\nHowever, your code accepts it. Fix your code!!!");
                        } else {
                            CustomerProduct[] newOperations = this.employee.getListOfPurchasingOperations();
                            if (newOperations.length - oldOperations.length != 3) {
                                System.out.println("There is a problem in adding new operations to the customers products file or arraylist");
                            } else {
                                double returnValue = this.employee.returnProduct(oP3.getCustomerSSN(), oP3.getProductID(), oP3.getPurchaseDate(), LocalDate.of(2023, 5, 17));
                                if (returnValue != (double)newProducts[oldProducts.length + 3].getPrice()) {
                                    System.out.println("There is a problem in returning the products");
                                } else {
                                    result = this.addPurchaseOperation(oP5);
                                    if (!result) {
                                        System.out.println("Purchase5: it is a valid purchase.\nHowever, your code refuses it. Fix your code!!!");
                                    } else {
                                        this.employee.logout();
                                        System.out.println("You have passed the tests of employee role.\nHowever, there will be different tests during the discussion.\nMake sure that you have implemented all the requirements correctly");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.testAdminRole();
        System.out.println("---------------------------------------------------\n---------------------------------------------------");
        test.testEmployeeRole();
    }
}
