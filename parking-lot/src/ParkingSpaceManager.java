import java.util.List;

public abstract class ParkingSpaceManager {
    List<ParkingSpot> parkingSpots;

    public ParkingSpaceManager(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;    // bec of this we have different lists associated for different parking managers
    }

    public abstract ParkingSpot findParkingSpot();

    void removeVehicle(Vehicle v) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.vehicle != null && spot.vehicle.equals(v)) {
                spot.removeVehicle();
                System.out.println("Vehicle removed from spot id:  " + spot.id);
                break;
            }
        }
    }
}
