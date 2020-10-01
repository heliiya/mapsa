package ir.mapsa;

import ir.mapsa.database.CRUD;
import ir.mapsa.database.DBConnection;
import ir.mapsa.database.TableGenerator;
import ir.mapsa.model.Customer;

import java.io.IOException;
import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException, IllegalAccessException {
        //DBConnection.getInstance().getConnection();

        /*TableGenerator tableGenerator = new TableGenerator();
        tableGenerator.createTable(new Customer());*/

        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("sima");
        customer.setLastName("basi");

        CRUD crud = new CRUD();
        crud.update(customer);
    }
}
