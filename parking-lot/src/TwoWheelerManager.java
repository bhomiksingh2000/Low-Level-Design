
import java.util.List;

public class TwoWheelerManager extends ParkingSpaceManager{
    public TwoWheelerManager(List<ParkingSpot> parkingSpots) {
        super(parkingSpots);
    }

    @Override
    public ParkingSpot findParkingSpot() {
        for(ParkingSpot parkingSpot : parkingSpots){
            if(parkingSpot.isEmpty){
                System.out.println("Parking spot found for two wheeler with id : " + parkingSpot.id);
                return parkingSpot;
            }
        }
        return null;
    }
}

