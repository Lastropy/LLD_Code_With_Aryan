package LLD_CWA.State_Pattern;

import LLD_CWA.State_Pattern.Context.IContext;
import LLD_CWA.State_Pattern.Context.TrafficLightContext;
import LLD_CWA.State_Pattern.States.IState;
import LLD_CWA.State_Pattern.States.LightState;

import static java.lang.Thread.sleep;

public class StateDemo {
    public static void main(String[] args) throws InterruptedException {
        IState redLightState = new LightState("RED");
        IState yelloLightState = new LightState("YELLOW");
        IState greenLightState = new LightState("GREEN");

        redLightState.setNextState(yelloLightState);
        yelloLightState.setNextState(greenLightState);
        greenLightState.setNextState(redLightState);

        IContext trafficLight = new TrafficLightContext(redLightState);
        for(int i = 0; i < 5; i++){
            trafficLight.next();
            sleep(2000);
        }
    }
}
