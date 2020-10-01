package ir.mapsa.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private String driver;
    private String user;
    private String pass;
    private String url;

    public DBConnection() {
    }

    private Connection connection;

    private static DBConnection instance = null;

    public static DBConnection getInstance() {
        if(instance == null){
            synchronized (DBConnection.class){
                instance = new DBConnection();
            }
        }
        return instance;
    }

    public Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
        File file = new File("src/main/resources/application.properties");
        Properties properties = new Properties();
        properties.load(new FileInputStream(file));
        this.driver = properties.getProperty("db.driver");
        this.user = properties.getProperty("db.user");
        this.pass = properties.getProperty("db.pass");
        this.url = properties.getProperty("db.url");

        Class.forName("oracle.jdbc.OracleDriver");
        connection = DriverManager.getConnection(url, user, pass);
        System.out.println("connection successful");
        return connection;
    }



}
