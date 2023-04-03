package WithStrategyPattern;

import WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadvehicle extends Vehicle {
    OffRoadvehicle(){
        super(new SportsDriveStrategy());
    }
}
