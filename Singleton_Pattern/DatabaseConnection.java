package LLD_CWA.Singleton_Pattern;

import static java.lang.Thread.sleep;

public class DatabaseConnection {
    static volatile DatabaseConnection instance = null;
    static int numOfConnections = 0;

    private DatabaseConnection(){}
    public static DatabaseConnection getInstance() throws InterruptedException {
        if (instance == null){
            // Synchronized over class. 1 thread per class allowed.
            // if synchronized(this) => 1 thread per class object allowed.
            synchronized (DatabaseConnection.class) {
                if(instance == null) {
                    System.out.println("Created new db connection!!");
                    instance = new DatabaseConnection();
                    numOfConnections++;
                }
            }
        }
        return instance;
    }

    void checkConnection(){
        System.out.println("Connection is live!!");
    }
}
