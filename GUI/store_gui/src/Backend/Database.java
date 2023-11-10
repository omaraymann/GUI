/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author 20127
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

abstract class Database {
    private String filename;
    private ArrayList<Record> records = new ArrayList();
    private Record user;

    public Database(String filename) {
        this.filename = filename;
        this.readFromFile();
    }

    public void readFromFile() {
        try {
            File file = new File(this.filename);
            Scanner myReader = new Scanner(file);

            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                this.records.add(this.createRecordFrom(data));
            }

            myReader.close();
        } catch (FileNotFoundException var4) {
            System.out.println("An error occurred.");
            var4.printStackTrace();
        }

    }

    abstract Record createRecordFrom(String var1);

    public ArrayList<Record> returnAllRecords() {
        return this.records;
    }

    public boolean contains(String key) {
        return this.getRecord(key) != null;
    }

    public Record getRecord(String key) {
        for(Record record: records)
        {
            if(key.equals(record.getSearchKey()))
            {
                return record;  //returns a reference to the EmployeeUser with id = key
            }
        }
        return null; //EmployeeUser with id key is not found
    }

    public void insertRecord(Record record) {
        if (record != null && !this.contains(record.getSearchKey())) {
            this.records.add(record);
            if(record instanceof EmployeeUser)
                JOptionPane.showMessageDialog(null,"The Employee with id = "+record.getSearchKey()+" has been successfully added");
            else if(record instanceof Product)
                JOptionPane.showMessageDialog(null,"The Product with id = "+record.getSearchKey() + " has been successfully added");
            else if(record instanceof EmployeeUser)
                JOptionPane.showMessageDialog(null,"The Customer with SSN = "+((CustomerProduct)record).getCustomerSSN() + " has successfully Purchased the product with id = " + ((CustomerProduct) record).getProductID());

        }
        else 
        {
            if(record instanceof EmployeeUser )
                JOptionPane.showMessageDialog(null,"The Employee with id = "+record.getSearchKey()+" username already exists!");
            else if(record instanceof Product)
                JOptionPane.showMessageDialog(null,"The Product with id = "+record.getSearchKey() + " already exists!");
            else if(record instanceof EmployeeUser)
                JOptionPane.showMessageDialog(null,"The Customer with SSN = "+((CustomerProduct)record).getCustomerSSN() + " has successfully Purchased the product with id = " + ((CustomerProduct) record).getProductID());
        }
    }

    public void deleteRecord(String key) {
        Record record = this.getRecord(key);
        if (record != null) {
            if(record instanceof EmployeeUser)
                JOptionPane.showMessageDialog(null,"The Employee with id = "+record.getSearchKey()+" has been successfully deleted");
            this.records.remove(record);
        }

    }

    public void SaveToFile() {
        int recordsCapacity = this.records.size();

        try {
            FileWriter file = new FileWriter(this.filename);

            try {
                Iterator var3 = this.records.iterator();

                while(var3.hasNext()) {
                    Record record = (Record)var3.next();
                    if (this.records.indexOf(record) == recordsCapacity - 1) {
                        file.write(record.lineRepresentation());
                    } else {
                        file.write(record.lineRepresentation() + "\n");
                    }
                }
            } catch (Throwable var6) {
                try {
                    file.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }

                throw var6;
            }

            file.close();
        } catch (IOException var7) {
            System.out.println("An error occurred.");
        }

    }
}

