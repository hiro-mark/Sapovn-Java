public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {}   // PC

    public static synchronized DatabaseConnection getInstance() { // SI and SG
        if (instance == null) {
            instance = new DatabaseConnection(); // Same same
        }
        return instance;
    }

    public void query(String sql) {}
}