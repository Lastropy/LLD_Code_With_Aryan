package LLD_CWA.Observer_Pattern;

public class ObserverDemo {
    public static void main(String[] args) {
        Observable ob = new Observable();
        System.out.println("Adding 5 subscribers");
        for(int i = 0; i < 5; i++){
            Observer obs = new Observer(i);
            ob.addSubscriber(obs);
            if(i == 3) ob.removeSubscriber(obs);
        }
        ob.action();
    }
}
