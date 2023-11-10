/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author 20127
 */
public class EmployeeUserDatabase extends Database {
    public EmployeeUserDatabase(String filename) {
        super(filename);
    }

    @Override
    public EmployeeUser createRecordFrom(String line) {
        String[] taken = line.split(",");
        return new EmployeeUser(taken[0], taken[1], taken[2], taken[3], taken[4]);
    }
}
