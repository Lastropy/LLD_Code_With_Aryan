package LLD_CWA.Questions.ProducerConsumerProblem;

public class ConsumerTask implements Runnable{
    private SharedResource obj;

    ConsumerTask(SharedResource _obj){
        obj = _obj;
    }

    @Override
    public void run(){
        System.out.println("Starting Consumer Task");
        for(int i = 0; i < 5; i++){
            try {
                System.out.println("Consumer sleeping for 2s");
                Thread.sleep(2000);
                System.out.println("Consumed Item: "+ obj.consumeItem());
            } catch (Exception e){
                System.out.println("Error during Consumer Task: " + e.toString());
            }
        }
        System.out.println("Consumer Task Completed.");
    }
}