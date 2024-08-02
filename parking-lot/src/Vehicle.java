public class Vehicle {
    String vehicleNumber;
    VehicleType vehicleType;

    public Vehicle(String vehicleNumber, VehicleType vehicleType){
        System.out.println("Vehicle entered in complex : " + vehicleNumber + " and type : " + vehicleType);
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
}
