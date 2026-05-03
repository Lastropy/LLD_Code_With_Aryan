package LLD_CWA.Questions.ProducerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    private Queue<Integer> buffer;
    private int bufferSize;
    SharedResource(int size){
        buffer = new LinkedList<Integer>();
        bufferSize = size;
    }

    public synchronized void produceItem(int i) throws Exception{
        while(buffer.size() == bufferSize){
            try {
                System.out.println("Buffer is full. Waiting for Consumer to create an empty slot.");
                wait();
            } catch (Exception e){
                System.out.println("Error occurred during production: "+ e.toString());
            }
        }
        System.out.println("A Buffer Slot is available right now. Adding item to buffer: "+ i);
        buffer.add(i);
        notifyAll();
    }

    public synchronized Integer consumeItem() throws Exception{
        while(buffer.isEmpty()){
            try {
                System.out.println("Buffer is Empty. Waiting for Producer to add an item.");
                wait();
            } catch (Exception e){
                System.out.println("Error occurred during consumption: "+ e.toString());
            }
        }
        Integer x = buffer.poll();
        System.out.println("A Buffer Item is available right now. Consuming item from buffer: "+ x);
        notifyAll();
        return x;
    }
}
