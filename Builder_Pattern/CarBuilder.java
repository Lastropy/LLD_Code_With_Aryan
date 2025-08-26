package LLD_CWA.Builder_Pattern;

public class CarBuilder extends Vehicle{
    CarBuilder setName(String name){
        this.name = name;
        return this;
    }
    CarBuilder setCost(double cost){
        this.cost = cost;
        return this;
    }
    CarBuilder setAutomatic(Boolean auto){
        this.automatic = auto;
        return this;
    }

    Car build(){
        return new Car(this);
    }
}
