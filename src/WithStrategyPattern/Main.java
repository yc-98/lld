package WithStrategyPattern;

public class Main {
    public static void main(String args[]){
        Vehicle sportsV = new SportsVehicle();
        sportsV.drive();
        Vehicle passengerV = new PassengerVehicle();
        passengerV.drive();
        Vehicle offRoadV = new OffRoadvehicle();
        offRoadV.drive();
    }
}
