package patterns.structural.adapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    public Connection connectUserToDatabase(NetworkUser user) {
        Connection connection = null;
        try {
            Class.forName(user.getDriver());
            connection = DriverManager.getConnection(user.getURL(), user.getUsername(), user.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}
