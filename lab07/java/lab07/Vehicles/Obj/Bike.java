package lab07.Vehicles.Obj;

import lab07.Vehicles.Logic.ParkingEntry;

public class Bike extends Vehicle implements ParkingEntry {
    String name;

    public Bike() {
        super();
    }

    public Bike(String identifier) {
        super(identifier);
        this.name = identifier;
    }

	public String getIdentifier() {
		return this.identifier + this.getClass().getSimpleName().toLowerCase();
	}
}
