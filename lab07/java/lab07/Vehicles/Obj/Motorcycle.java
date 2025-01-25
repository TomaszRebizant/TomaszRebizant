package lab07.Vehicles.Obj;

import lab07.Vehicles.Logic.ParkingEntry;

public class Motorcycle extends Vehicle implements ParkingEntry {
    String plate;
    public Motorcycle(String plate) {
        super();
        this.plate = plate;
    }
    public Motorcycle(String plate, String name) {
        super(name);
        this.plate = plate;
    }

    public String getIdentifier() {
        return this.identifier + " by motorcycle [" + this.plate + "]";
    }
    public String getAnonymousIdentifier() {
        return "anonymous by motorcycle [" + this.plate + "]";
    }
}
