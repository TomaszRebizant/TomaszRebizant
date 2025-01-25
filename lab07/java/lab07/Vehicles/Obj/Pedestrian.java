package lab07.Vehicles.Obj;

import lab07.Vehicles.Logic.ParkingEntry;

public class Pedestrian implements ParkingEntry {
    protected boolean isAnonymous = false;
    protected String name;

    public Pedestrian() {
        this.isAnonymous = true;
    }

    public Pedestrian(String name) {
        this.name = name;
    }

    protected String getAnonymous()
    {
        return "anonymous " + this.getClass().getSimpleName().toLowerCase();
    }

    public String identify()
    {
        if (this.isAnonymous) {
            return this.getAnonymous() +" entered the parking";
        }

        return this.name + " entered the parking";
    }

}
