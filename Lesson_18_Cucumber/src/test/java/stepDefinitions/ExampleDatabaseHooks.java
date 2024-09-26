/*
package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.sql.Connection;
import java.sql.DriverManager;

public class ExampleDatabaseHooks {

    private Connection connection;

    @Before
    public void connectToDatabase() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/OrionDB", "admin", "Admin1234");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void closeDatabaseConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/
