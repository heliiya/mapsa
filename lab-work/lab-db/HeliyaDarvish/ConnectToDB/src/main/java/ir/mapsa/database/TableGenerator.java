package ir.mapsa.database;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ir.mapsa.persistence.Column;
import ir.mapsa.persistence.Table;

public class TableGenerator {

    /*
        create table CUSTOMER (id number(10), firstName varchar(30), lastName varchar(30))
    */
    public void createTable(Object object){
        DBConnection dbConnection = DBConnection.getInstance();
        Connection connection = null;
        try {
            connection = dbConnection.getConnection();
        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        Table table = object.getClass().getDeclaredAnnotation(Table.class);
        String query = "CREATE TABLE " + table.name() + " (";
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field: fields) {
            Column column = field.getAnnotation(Column.class);
            query += column.name() + " " + column.dataType() +
                    "(" + column.length() + "),";
        }
        if (query.trim().endsWith(",")){
            query = query.substring(0, query.length() - 1);
        }
        query += ")";

        assert connection != null;
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(query);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
