package LLD_CWA.Observer_Pattern;

public class Observer implements IObserver {
    int id;
    Observer(int id){
        this.id = id;
    }

    public void notify(int val){
        System.out.println("Received value from Observable: "+val+" for id: "+id);
    }
}
