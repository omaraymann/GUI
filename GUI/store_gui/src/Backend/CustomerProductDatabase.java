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

public class CustomerProductDatabase extends Database {
    public CustomerProductDatabase(String filename) {
        super(filename);
    }

    @Override
    public CustomerProduct createRecordFrom(String line) {
        String[] taken = line.split(",");
        String[] s = taken[2].split("-");
        return new CustomerProduct(taken[0], taken[1], LocalDate.of(Integer.parseInt(s[2]), Integer.parseInt(s[1]), Integer.parseInt(s[0])));
    }
}
