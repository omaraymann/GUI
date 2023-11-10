/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author 20127
 */
public class ProductDatabase extends Database {
    public ProductDatabase(String filename) {
        super(filename);
    }

    @Override
    public Product createRecordFrom(String line) {
        String[] taken = line.split(",");
        Product user = new Product(taken[0], taken[1], taken[2], taken[3], Integer.parseInt(taken[4]), Float.parseFloat(taken[5]));
        return user;
    }
}
