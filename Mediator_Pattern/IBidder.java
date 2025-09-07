package LLD_CWA.Mediator_Pattern;

public interface IBidder {
    int getId();
    void addMediator(IMediator md);
    void removeMediator();
    void placeBid(int amount);
    void getNotifiedOfBid(IBidder b, int amt);
}
