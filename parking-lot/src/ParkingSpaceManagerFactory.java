
import java.util.List;

public class ParkingSpaceManagerFactory {
    ParkingSpaceManager getParkingSpaceManager(Vehicle vehicle, List<ParkingSpot> parkingSpots){
        if(vehicle.vehicleType == VehicleType.TwoWheeler){
            return new TwoWheelerManager(parkingSpots);
        }

        else if(vehicle.vehicleType == VehicleType.FourWheeler){
            return new FourWheelerManager(parkingSpots);
        }

        return null;
    }
}
