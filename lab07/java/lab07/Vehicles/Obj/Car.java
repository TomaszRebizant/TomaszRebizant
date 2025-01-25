package lab07.Vehicles.Obj;

import lab07.Vehicles.Lists.workers;
import lab07.Vehicles.Logic.ParkingEntry;
import lab07.Vehicles.Lists.colors;

import java.awt.*;

public class Car extends Vehicle implements ParkingEntry {
    protected String plates;
    protected String model;
    protected Color color=null;



    public Car(String plates, String model) {
        super();
        this.model = model;
        this.plates = plates;
    }

    public Car(String plates, String model, Color color) {
        super();
        this.color = color;
        this.model = model;
        this.plates = plates;
    }
    public Car(String plates,String model, String name) {
        super(name);
        this.model = model;
        this.plates = plates;
            if(workers.isWorker(name)) {
                this.identifier = "Worker " + name;
                return;
            }

    }


    public Car(String plates,String model, String name, Color color) {
        super(name);
        this.model = model;
        this.plates = plates;
        this.color = color;
            if(workers.isWorker(name)) {
                this.identifier = "Worker " + name;
                return;
            }

    }

	public String getIdentifier() {
        if(color == null) {
            return this.identifier + " by "+ this.model +" [" + this.plates + "]";
        } else {
            return this.identifier + " by "+ this.model +" [" + this.plates + "] in " + colors.getNameByColor(color)+ " car";
        }
	}

	public String getAnonymousIdentifier() {
        if(color == null)
        {
            return "anonymous by "+ this.model +" [" + this.plates + "]";
        } else {
            return "anonymous by "+ this.model +" [" + this.plates + "] in " + colors.getNameByColor(color) + " car";
        }
	}
    public String getSurname() {
        return this.identifier;
    }
    public String getPlates() {
        return this.plates;
    }
}
