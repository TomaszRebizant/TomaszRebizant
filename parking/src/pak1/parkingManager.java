package pak1;

import java.util.*;

public class parkingManager {
    Queue<car> kolejka = new LinkedList<>();
    car[][] parking = new car[2][1];
    public List<ParkingSession> listParkingSession = new ArrayList<>();

    public void addCar(String str, List list){
        if(czyNaParkingu(str) || czyWKolejce(str))
        {
            System.out.println("Samochód jest na parkingu lub w kolejce");
        }
        else{
            car auto = new car(str);
            kolejka.add(auto);
                wjedz(list);
        }
    }
    void wjedz(List list){
        for (int i = 0; i < parking.length; i++) {
            for (int j = 0; j < parking[i].length; j++) {
                if(parking[i][j] == null) {
                    if(!kolejka.isEmpty()){
                        parking[i][j] = kolejka.poll();
                        System.out.println("Samochod o tablicy " + parking[i][j].getNr_rej()+ " Wjechał na parking na miejsce: " + (i+1) + "/" + (j+1));
                        parking[i][j].addToList(list);
                    }
                }
            }
        }
    }

    boolean czyNaParkingu(String nr){
        String nr_rej = nr;
        for(car[] p : parking){
            for(car pa: p){
                if(pa != null)
                    if(pa.getNr_rej().equals(nr))
                    {
                        return true;
                    }
            }
        }
        return false;
    }
    boolean czyWKolejce(String nr){
        String nr_rej = nr;
        for(car p : kolejka){
                if(p != null)
                    if(p.getNr_rej().equals(nr))
                    {
                        return true;
                    }
            }

        return false;
    }

    public void printKolejka() {
        kolejka.forEach(car -> System.out.println(car.getNr_rej()));
    }
    public void printParking() {
        int wolne = 0, zajete = 0;
        for (int i = 0; i < parking.length; i++) {
            for (int j = 0; j < parking[i].length; j++) {
               if(parking[i][j] == null) {
                   wolne++;
                   System.out.println("Miejsce " + (i+1) + "/" + (j+1) + " jest wolne");
               }
               else{
                   zajete++;
                   System.out.println("Na miejscu o numerze " + (i+1) + "/" + (j+1) + " jest samochod o nr_rej " + parking[i][j].getNr_rej());
               }
            }
        }
        System.out.println(" Ilosc wolnych miejsc to: " + wolne);
        System.out.println("Ilosc zajetych miejsc to: " + zajete);
    }
    public void printList(){
        for(ParkingSession e: listParkingSession){
            System.out.println(e.getNr_rejestracycjny() + "\n" +e.getData_wjazdu() + "\n" +e.getData_wyjazdu() + "\n" );
        }
    }

    public void removeCarFromParking(String nr_rej, List list) {
        for (int i = 0; i < parking.length; i++) {
            for (int j = 0; j < parking[i].length; j++) {
                if(parking[i][j] != null)
                if(parking[i][j].getNr_rej().equals(nr_rej))
                {
                    parking[i][j].getParking().endParkingSession(new Date());
                    parking[i][j] = null;
                }
            }
        }
        wjedz(list);
    }
    public List getlist(){
                return this.listParkingSession;
            }
    }


