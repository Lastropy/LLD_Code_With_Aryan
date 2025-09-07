package LLD_CWA.State_Pattern.States;

public class LightState implements IState{
    String name;
    IState nextState;
    public LightState(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setNextState(IState nxt) {
        this.nextState = nxt;
    }

    @Override
    public IState next() {
        return this.nextState;
    }
}
