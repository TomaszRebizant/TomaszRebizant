package lab06.ParkingEntry;

public class Pedestrian implements ParkingEntry {
    private  String name;
    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String identify() {
        return "pedestrian";
    }
}
