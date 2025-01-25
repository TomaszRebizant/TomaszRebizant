package lab07.Vehicles.Obj;

import lab07.Vehicles.Logic.ParkingEntry;

public class Tank extends Vehicle implements ParkingEntry {
    private String plate;
    public Tank(String identifier) {
        super(identifier);
        this.plate = identifier;
    }

    protected String getIdentifier() {
        return "tank [" + this.identifier+ "] " +" entered the parking";
    }
}
