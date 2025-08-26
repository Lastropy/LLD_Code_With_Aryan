package LLD_CWA.Builder_Pattern;

public class Car extends Vehicle {
    Car(CarBuilder cb){
        this.name = cb.name;
        this.cost = cb.cost;
        this.automatic = cb.automatic;
    }

    void printSpecs(){
        System.out.println("Current Car Specs:");
        System.out.println("Name="+this.name);
        System.out.println("Cost="+this.cost);
        System.out.println("Automatic Or Not="+(this.automatic? "Yes": "No"));
    }
}
