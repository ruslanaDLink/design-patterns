package patterns.structural.adapter;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseAdapter extends NetworkUser implements DatabaseManager {
    private NetworkUser networkUser;
    private Connector connector;

    public DatabaseAdapter(NetworkUser user) {
        this.networkUser = user;
        connector = new Connector();
    }

    @Override
    public void connectToDatabase(String driver, String URL, String username, String password) {
        networkUser.setDriver(driver);
        networkUser.setURL(URL);
        networkUser.setUsername(username);
        networkUser.setPassword(password);

        Connection connection = connector.connectUserToDatabase(networkUser);
        try {
            if (connection != null && !connection.isClosed()) {
                System.out.println("Connected to database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
