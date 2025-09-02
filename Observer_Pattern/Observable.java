package LLD_CWA.Observer_Pattern;
import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<IObserver> observerList;
    Observable(){
        observerList = new ArrayList<IObserver>();
    }
    void addSubscriber(IObserver newObserver){
        System.out.println("Adding subscriber with id: "+newObserver.id);
        observerList.add(newObserver);
    }

    void removeSubscriber(IObserver existingObserver){
        System.out.println("Removing Subscriber with id: "+existingObserver.id);
        observerList.remove(existingObserver);
    }

    void action(){
        System.out.println("Performing action");
        this.notifyAll(42);
    }

    void notifyAll(int val){
        System.out.println("Notifying subscribers....");
        for(IObserver ob: observerList){
            ob.notify(val);
        }
    }
}
