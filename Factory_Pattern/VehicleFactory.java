package LLD_CWA.Factory_Pattern;

public class VehicleFactory {
    public static Vehicle getVehicle(VehicleType vehicleType) throws Exception {
        if(vehicleType == VehicleType.CAR){
            return new Car();
        } else if(vehicleType == VehicleType.BIKE){
            return new Bike();
        } else {
            throw new Exception("Invalid Vehicle Type Provided.");
        }
    }
}
