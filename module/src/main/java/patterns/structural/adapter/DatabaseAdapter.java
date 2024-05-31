package patterns.structural.adapter;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseAdapter extends NetworkUser implements DatabaseManager {
    private NetworkUser networkUser;
    private UserAdaptee userAdaptee;

    public DatabaseAdapter(NetworkUser user) {
        this.networkUser = user;
        userAdaptee = new UserAdaptee();
    }

    @Override
    public void connectToDatabase(String driver, String URL, String username, String password) {
        networkUser.setDriver(driver);
        networkUser.setURL(URL);
        networkUser.setUsername(username);
        networkUser.setPassword(password);

        Connection connection = userAdaptee.connectUserToDatabase(networkUser);
        try {
            if (connection != null && !connection.isClosed()) {
                System.out.println("Connected to database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
