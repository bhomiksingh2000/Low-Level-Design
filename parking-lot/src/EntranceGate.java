import java.util.ArrayList;

public class EntranceGate {

    //  Entrance gate will have an object of ParkingSpaceManagerFactory ,
    // as to create the particular parking space manager for the vehicle type

    // here we will find the find empty parking spot for the vehicle, park the vehicle and then generate Ticket for the vehicle
    // for all these methods we use factory for creating manager object for the vehicle type and then perform the above functions
    ParkingSpaceManagerFactory parkingSpaceManagerFactory;

    EntranceGate(ParkingSpaceManagerFactory parkingSpaceManagerFactory){
        this.parkingSpaceManagerFactory = parkingSpaceManagerFactory;
    }

    ParkingSpot findParkingSpot(Vehicle vehicle, ArrayList<ParkingSpot> parkingSpots){
        // thats why we have a ParkingSpaceManagerFactory object in EntranceGate to create the parking manager for the vehicle
        // here using factory we will create the parking manager for the vehicle,and then based upon the object returned by the factory we will go into the findParkingSpot method of the particular manager
        ParkingSpaceManager manager = parkingSpaceManagerFactory.getParkingSpaceManager(vehicle, parkingSpots);

        return manager.findParkingSpot();
    }

    void parkVehicle(Vehicle v, ParkingSpot spot){
        System.out.println("Vehicle parked for this spot id : " + spot.id);
        spot.parkVehicle(v);
    }

    Ticket generateTicket(String entryTime, Vehicle vehicle, ParkingSpot parkingSpot) {
        // Implementation to generate ticket
        System.out.println("Ticket generated for vehicle with number : " + vehicle.vehicleNumber + " at time : " + entryTime);
        return new Ticket(entryTime, parkingSpot, vehicle);
    }
}
