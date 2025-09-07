package LLD_CWA.Mediator_Pattern;

public class Bidder implements IBidder{
    int id;
    IMediator mediator;
    Bidder(int id){
        this.id = id;
        this.mediator = null;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void addMediator(IMediator md) {
        this.mediator = md;
    }

    @Override
    public void removeMediator(){
        this.mediator = null;
    }

    @Override
    public void placeBid(int amount) {
        mediator.addBidding(this, amount);
    }

    @Override
    public void getNotifiedOfBid(IBidder b, int amt) {
        System.out.println("Bidder: "+this.id+" got notified of bid from: "+b.getId()+" of amount: "+amt);
    }
}
