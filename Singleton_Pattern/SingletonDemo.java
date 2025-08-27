package LLD_CWA.Singleton_Pattern;

import javax.xml.crypto.Data;

public class SingletonDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("T1 acquiring connection");
                try {
                    DatabaseConnection db = DatabaseConnection.getInstance();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("T1 acquired connection");
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                System.out.println("T2 acquiring connection");
                try {
                    DatabaseConnection db = DatabaseConnection.getInstance();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("T2 acquired connection");
            }
        };

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        if(DatabaseConnection.numOfConnections > 1) {
            System.out.println("Not thread safe singleton. Connections="+DatabaseConnection.numOfConnections);
        } else {
            System.out.println("Thread safe singleton. Connections="+DatabaseConnection.numOfConnections);
        }
    }
}
