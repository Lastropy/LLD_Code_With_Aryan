package LLD_CWA.Questions.ProducerConsumerProblem;

public class ProducerTask implements Runnable {
    private SharedResource obj;

    ProducerTask(SharedResource _obj){
        obj = _obj;
    }

    @Override
    public void run(){
        System.out.println("Starting Producer Task");
        for(int i = 0; i < 5; i++){
            try {
                System.out.println("Producer sleeping for 3s");
                Thread.sleep(3000);
                System.out.println("Producing Item: "+ i);
                obj.produceItem(i);
            } catch (Exception e){
                System.out.println("Error during Production Task: " + e.toString());
            }
        }
        System.out.println("Producer Task Completed.");
    }
}
