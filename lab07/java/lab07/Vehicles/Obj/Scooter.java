package lab07.Vehicles.Obj;

import lab07.Vehicles.Logic.ParkingEntry;

public class Scooter extends Vehicle implements ParkingEntry {
    String name;
    public Scooter(){
        super();
    }
    public Scooter(String identifier){
        super(identifier);
        this.name = identifier;
    }

    @Override
    protected String getIdentifier() {
        return identifier + " entered by " + this.getClass().getSimpleName().toLowerCase();
    }
}
