package LLD_CWA.Factory_Pattern;

public class FactoryDemo {
    public static void main(String[] args) {
        try{
            Vehicle obj;
            VehicleType type = VehicleType.BIKE;
            obj = VehicleFactory.getVehicle(type);
            obj.start();
            System.out.println("Milege Recieved: "+ obj.getMilege());
            obj.stop();
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
