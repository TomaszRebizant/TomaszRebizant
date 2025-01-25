package lab07.Vehicles.Logic;

public interface ParkingEntry {
    public String name = "";

    public default String enterParking() {
        return getClass().getSimpleName();
    }
    public String identify();
}
