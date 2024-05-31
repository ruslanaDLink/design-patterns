package patterns.structural.adapter;

//target interface
public interface DatabaseManager {

    void connectToDatabase(String driver, String URL, String username, String password);

}
