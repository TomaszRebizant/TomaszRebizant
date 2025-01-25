package lab07.Vehicles.Obj;

import lab07.Vehicles.Logic.ParkingEntry;

public class Ambulance extends Vehicle implements ParkingEntry {
    String plate;

    public Ambulance(String plate){
        super(plate);
        this.plate = plate;
    }

    @Override
    protected String getIdentifier() {
        return "Ambulance ["+this.plate+"] entered the parking";
    }
}
