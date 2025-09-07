package LLD_CWA.State_Pattern.Context;

import LLD_CWA.State_Pattern.States.IState;

public class TrafficLightContext implements IContext{
    IState currentState;
    public TrafficLightContext(IState startingState){
        this.currentState = startingState;
        System.out.println("Set Initial State to: "+startingState.getName());
    }

    @Override
    public IState getCurrentState() {
        return this.currentState;
    }

    @Override
    public void setState(IState state){
        this.currentState = state;
        System.out.println("Changed State to: "+currentState.getName());
    }

    @Override
    public void next() {
        this.setState(this.currentState.next());
    }
}
