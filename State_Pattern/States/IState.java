package LLD_CWA.State_Pattern.States;

public interface IState {
    String getName();
    void setNextState(IState nxt);
    IState next();
}
