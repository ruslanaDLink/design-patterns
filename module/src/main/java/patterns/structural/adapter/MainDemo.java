package patterns.structural.adapter;

import java.sql.Connection;
import java.sql.SQLException;

public class MainDemo {

    public static void main(String[] args) throws SQLException {
        NetworkUser user = new NetworkUser();

        Connector connector = new Connector();

        DatabaseAdapter adapter = new DatabaseAdapter(user);

        Connection connection = connector.connectUserToDatabase(adapter);

        boolean isValid = connection.isValid(3000);
        System.out.println("Is connection valid? " + isValid);
    }
}
