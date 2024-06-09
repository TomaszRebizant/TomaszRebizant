package pak1;

import java.util.Date;
import java.util.List;

public class car {
    private final String nr_rej;
    private ParkingSession parking = new ParkingSession();

    car(String nr_rej) {
        this.nr_rej = nr_rej;
        parking.setNr_rejestracycjny(nr_rej);
    }
   public void addToList(List list){
        parking.setData_wjazdu(new Date());
        list.add(parking);
   }
    public String getNr_rej() {
        return this.nr_rej;
    }
    public ParkingSession getParking() {
        return this.parking;
    }
}





