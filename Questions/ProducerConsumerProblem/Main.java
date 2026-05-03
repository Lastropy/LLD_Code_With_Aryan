package LLD_CWA.Questions.ProducerConsumerProblem;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource(3);

        Thread producerThread = new Thread(new ProducerTask(resource));
        Thread consumerThread = new Thread(new ConsumerTask(resource));

        System.out.println("Starting Threads...");
        consumerThread.start();
        producerThread.start();
    }
}
