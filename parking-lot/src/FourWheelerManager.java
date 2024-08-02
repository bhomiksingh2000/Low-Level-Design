
import java.util.List;

public class FourWheelerManager extends ParkingSpaceManager{
    public FourWheelerManager(List<ParkingSpot> parkingSpots) {
        super(parkingSpots);
    }

    @Override
    public ParkingSpot findParkingSpot() {
        for(ParkingSpot parkingSpot : parkingSpots){
            if(parkingSpot.isEmpty){
                System.out.println("Parking spot found for Four wheeler with id : " + parkingSpot.id);
                return parkingSpot;
            }
        }
        return null;
    }
}
