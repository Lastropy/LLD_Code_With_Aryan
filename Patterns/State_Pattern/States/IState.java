package LLD_CWA.Patterns.State_Pattern.States;

public interface IState {
    String getName();

    void setNextState(IState nxt);

    IState next();
}
