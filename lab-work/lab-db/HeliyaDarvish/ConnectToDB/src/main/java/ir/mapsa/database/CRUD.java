package ir.mapsa.database;

import ir.mapsa.persistence.Column;
import ir.mapsa.persistence.Id;
import ir.mapsa.persistence.Table;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// as ORM like hibernate
public class CRUD implements CRUDDB{

    DBConnection dbConnection = null;
    Connection connection = null;

    /* insert into CUSTOMER(ID, FIRST_NAME, LAST_NAME) values (1, 'heliya', 'darvish') */
    @Override
    public void save(Object object) throws IllegalAccessException, SQLException, IOException, ClassNotFoundException {
        String query = "INSERT INTO ";
        Table table = object.getClass().getDeclaredAnnotation(Table.class);
        query += table.name() + "(";
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Column column = field.getDeclaredAnnotation(Column.class);
            if (column != null){
                query += column.name() + ",";
            }
        }
        if (query.trim().endsWith(",")){
            query = query.substring(0, query.length()-1);
        }
        query += ") VALUES (";
        for (Field field : fields) {
            if (field.getType().getSimpleName().endsWith("String"))
                query += "'" + field.get(object) + "'";
            else
                query += field.get(object);
            query += ",";
        }
        if (query.trim().endsWith(",")){
            query = query.substring(0, query.length()-1);
        }
        query += ")";
        System.out.println(query);
        dbConnection = DBConnection.getInstance();
        connection = dbConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.execute();
    }

    /* update CUSTOMER set FIRST_NAME='ahmad', LAST_NAME='amiri' where ID=1 */
    @Override
    public void update(Object object) throws IllegalAccessException, SQLException, IOException, ClassNotFoundException {
        String query = "UPDATE ";
        Table table = object.getClass().getDeclaredAnnotation(Table.class);
        query += table.name() + " SET ";
        Field[] fields = object.getClass().getDeclaredFields();
        Object idValue = null;
        String idColumn = null;
        for (Field field : fields) {
            field.setAccessible(true);
            Column column = field.getAnnotation(Column.class);
            Id id = field.getAnnotation(Id.class);
            if (id != null){
                idValue = field.get(object);
                idColumn = column.name();
            }
            if (column != null && id == null){
                query += column.name() + "=";
                if (field.getType().getSimpleName().endsWith("String"))
                    query += "'" + field.get(object) + "'";
                else
                    query += field.get(object);
                query += ",";
            }
        }
        if (query.trim().endsWith(","))
            query = query.substring(0, query.length()-1);
        query += " WHERE " + idColumn + "=" + idValue;
        System.out.println(query);
        dbConnection = DBConnection.getInstance();
        connection = dbConnection.getConnection();
        connection.prepareStatement(query).executeUpdate();
    }

    @Override
    public void delete(Object object) {

    }

    @Override
    public void findAll(Object object) {

    }

    @Override
    public void findById(Object object) {

    }
}
