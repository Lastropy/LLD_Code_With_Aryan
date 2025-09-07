package LLD_CWA.Mediator_Pattern;

public interface IMediator {
    void registerBidder(IBidder b);
    void removeBidder(IBidder b);
    void addBidding(IBidder b, int amt);
    void notifyBiddersExcept(IBidder b, int amt);
}
