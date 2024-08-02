public class Ticket {
    String entryTime;
    ParkingSpot parkingSpot;

    Vehicle vehicle;

    public Ticket(String entryTime, ParkingSpot parkingSpot, Vehicle vehicle){
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }
}
