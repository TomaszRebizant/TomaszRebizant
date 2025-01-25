package lab07.Vehicles.Obj;

import lab07.Vehicles.Logic.ParkingEntry;

public class Truck extends Vehicle implements ParkingEntry {
    private  String plate;
    private  String companyName;
    public Truck(String identifier, String companyName) {
        super(identifier);
        this.plate = identifier;
        this.companyName = companyName;
    }

    protected String getIdentifier() {
        return "truck [" + this.identifier+ "] from " + this.companyName;
    }
}
