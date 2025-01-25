package lab06.ParkingEntry;

public class Ambulance implements ParkingEntry {
    private String plate;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String identify() {
        return "ambulance";
    }
}
