package patterns.structural.adapter;

import java.sql.Connection;
import java.sql.SQLException;

public class MainDemo {

    public static void main(String[] args) throws SQLException {
        NetworkUser user = new NetworkUser();

        UserAdaptee userAdaptee = new UserAdaptee();

        DatabaseAdapter adapter = new DatabaseAdapter(user);

        Connection connection = userAdaptee.connectUserToDatabase(adapter);

        boolean isValid = connection.isValid(3000);
        System.out.println("Is connection valid? " + isValid);
    }
}
