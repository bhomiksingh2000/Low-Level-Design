import java.util.*;
public class ExitGate {

    // exit gate will also have a parking space manager factory, for creating the particular parking manager for the vehicle type,
    // and then perform the remove vehicle operation  for the particular  vehicle type
    ParkingSpaceManagerFactory parkingSpaceManagerFactory;

    public ExitGate(ParkingSpaceManagerFactory parkingSpaceManagerFactory){
        this.parkingSpaceManagerFactory = parkingSpaceManagerFactory;
    }
    void removeVehicle(Ticket ticket) {
        ParkingSpaceManager manager = parkingSpaceManagerFactory.getParkingSpaceManager(ticket.vehicle, new ArrayList<>());
        System.out.println("Vehicle removed from parking spot id :" + ticket.parkingSpot.id + " Vehicle No: " + ticket.vehicle.vehicleNumber + " and type : " + ticket.vehicle.vehicleType);
        manager.removeVehicle(ticket.vehicle);
    }
}
