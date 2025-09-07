package LLD_CWA.Mediator_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediator{
    List<IBidder> bidders;
    Mediator(){
        this.bidders = new ArrayList<IBidder>();
    }

    @Override
    public void registerBidder(IBidder b) {
        System.out.println("Adding Bidder " + b.getId());
        bidders.add(b);
        b.addMediator(this);
    }

    @Override
    public void removeBidder(IBidder b) {
        System.out.println("Removing bidder: "+ b.getId());
        bidders.remove(b);
        b.removeMediator();
    }

    @Override
    public void addBidding(IBidder b, int amt) {
        System.out.println("\n\nReceived bid of "+amt+" from bidder: "+b.getId());
        this.notifyBiddersExcept(b, amt);
    }

    @Override
    public void notifyBiddersExcept(IBidder b, int amt) {
        for(IBidder bidder: bidders){
            if(bidder != b) {
                bidder.getNotifiedOfBid(b, amt);
            }
        }
    }
}
