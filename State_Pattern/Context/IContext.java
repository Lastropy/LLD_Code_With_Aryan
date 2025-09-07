package LLD_CWA.State_Pattern.Context;

import LLD_CWA.State_Pattern.States.IState;

public interface IContext {
    IState getCurrentState();
    void next();
}
