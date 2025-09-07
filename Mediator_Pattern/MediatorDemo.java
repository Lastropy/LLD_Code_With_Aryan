package LLD_CWA.Mediator_Pattern;

import java.util.ArrayList;
import java.util.List;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator m = new Mediator();
        List<IBidder> bidders = new ArrayList<IBidder>();
        for(int i = 0; i < 5; i++){
            IBidder b = new Bidder(i+1);
            m.registerBidder(b);
            bidders.add(b);
        }

        for(IBidder b: bidders){
            int bidAmount = (int) (250 + Math.random() * 100);
            b.placeBid(bidAmount);
        }


    }
}
