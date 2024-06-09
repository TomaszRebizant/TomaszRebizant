package pak1;

import java.util.Date;

public class ParkingSession {
    String nr_rejestracycjny;
    Date data_wjazdu;
    Date data_wyjazdu;

    public void endParkingSession(Date data_wjazdu){
        this.data_wyjazdu = data_wjazdu;
    }
    public void setNr_rejestracycjny(String nr_rejestracycjny){
        this.nr_rejestracycjny = nr_rejestracycjny;
    }
    public void setData_wjazdu(Date data_wjazdu){
        this.data_wjazdu = data_wjazdu;
    }
    public String getNr_rejestracycjny(){
        return nr_rejestracycjny;
    }
    public Date getData_wjazdu(){
        return data_wjazdu;
    }
    public Date getData_wyjazdu(){
        return data_wyjazdu;
    }

}
