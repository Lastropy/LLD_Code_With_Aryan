package LLD_CWA.Patterns.State_Pattern.Context;

import LLD_CWA.Patterns.State_Pattern.States.IState;

public interface IContext {
    IState getCurrentState();

    void next();

    void setState(IState state);
}
