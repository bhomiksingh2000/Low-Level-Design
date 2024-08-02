import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ParkingSpot> parkingSpots = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            parkingSpots.add(new ParkingSpot(i, 100));
        }

        ParkingSpaceManagerFactory parkingSpaceManagerFactory = new ParkingSpaceManagerFactory();
        Vehicle brezza = new Vehicle("HR 36 ZZZ 2855", VehicleType.FourWheeler);
        Vehicle activa = new Vehicle("HR 26 ACDDD 7120", VehicleType.TwoWheeler);
        Vehicle creta = new Vehicle("HR 07 ACDDD 0000", VehicleType.FourWheeler);

        EntranceGate entranceGate = new EntranceGate(parkingSpaceManagerFactory);

        ParkingSpot spot1 = entranceGate.findParkingSpot(brezza, new ArrayList<>(parkingSpots));
        entranceGate.parkVehicle(brezza, spot1);
        Ticket brezzaTicket = entranceGate.generateTicket("12:25", brezza, spot1);

        ParkingSpot spot2 = entranceGate.findParkingSpot(activa, new ArrayList<>(parkingSpots));
        entranceGate.parkVehicle(activa, spot2);
        Ticket activaTicket = entranceGate.generateTicket("12:25", activa, spot2);

        ParkingSpot spot3 = entranceGate.findParkingSpot(creta, new ArrayList<>(parkingSpots));
        entranceGate.parkVehicle(creta, spot2);
        Ticket cretaTicket = entranceGate.generateTicket("12:25", creta, spot3);

        ExitGate exitGate = new ExitGate(parkingSpaceManagerFactory);
        exitGate.removeVehicle(brezzaTicket);
        exitGate.removeVehicle(activaTicket);
        exitGate.removeVehicle(cretaTicket);




    }
}
