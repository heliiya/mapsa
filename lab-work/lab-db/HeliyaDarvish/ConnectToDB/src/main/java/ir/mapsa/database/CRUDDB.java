package ir.mapsa.database;

import java.io.IOException;
import java.sql.SQLException;

// as JPA
public interface CRUDDB {

    void save(Object object) throws IllegalAccessException, SQLException, IOException, ClassNotFoundException;

    void update(Object object) throws IllegalAccessException, SQLException, IOException, ClassNotFoundException;

    void delete(Object object);

    void findAll(Object object);

    void findById(Object object);
}
