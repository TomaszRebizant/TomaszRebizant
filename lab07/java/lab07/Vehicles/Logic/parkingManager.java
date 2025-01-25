package lab07.Vehicles.Logic;

import lab07.Vehicles.Lists.*;
import lab07.Vehicles.Obj.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class parkingManager {
    ArrayList<ParkingEntry> parkingEntries = new ArrayList<ParkingEntry>();
    static Integer carSpot = 20, bikeSpot = 10, MotorbikeSpot = 5;
    static Integer carAttempt = 0, bikeAttempt = 0, MotorbikeAttempt = 0, blackListAttempt = 0;

    Integer collectedMoney = 0;



    public void openParking(){
        queueGenerator que = new queueGenerator(40);
        for (ParkingEntry entry : que.getParkingEntries()) {
            add(entry);
        }
    }


    public  void add(ParkingEntry obj) {
        if(obj instanceof Dog || obj instanceof Tank){
            parkingManager.logEntry(obj, false);
            return;
        }
        if(obj instanceof Car){
            if(carSpot > carAttempt){
                if(blackList.isOnBlackList(((Car) obj).getPlates())){
                    parkingManager.logEntry(obj, false);
                    blackListAttempt++;
                    return;
                }
                if(workersWithSubsciption.isWorker(String.valueOf(((Car) obj).getSurname()))){
                    carAttempt++;
                    parkingEntries.add(obj);
                    return;
                } else {
                    collectedMoney += 5;
                    carAttempt++;
                    parkingEntries.add(obj);
                    return;
                }
            }
            parkingManager.logEntry(obj, false);
            carAttempt++;
            return;
        }
        if(obj instanceof Bike){
            if(bikeSpot > bikeAttempt){
                bikeAttempt++;
                parkingEntries.add(obj);
                return;
            } else {
                bikeAttempt++;
                parkingManager.logEntry(obj, false);
                return;
            }
        }
        if(obj instanceof Motorcycle){
            if(MotorbikeSpot > MotorbikeAttempt){
                MotorbikeAttempt++;
                parkingEntries.add(obj);
                collectedMoney += 2;
                return;
            } else {
                MotorbikeAttempt++;
               parkingManager.logEntry(obj, false);
                return;
            }
        }
        if (obj instanceof Ambulance || obj instanceof Pedestrian || obj instanceof Scooter || obj instanceof Truck){
            parkingEntries.add(obj);
        }
    }
    public void printQueue() {
        for (int i = parkingEntries.size() - 1; i >= 0; i--) {
            System.out.println(parkingEntries.get(i).identify());
        }
    }
    public void printQueue2() {
        for (int i = parkingEntries.size() - 1; i >= 0; i--) {
            parkingManager.logEntry(parkingEntries.get(i), true);
        }
    }

    public void getSummary(){
        System.out.println("money collected: " + collectedMoney);
        System.out.println("entered count: " + (carAttempt + bikeAttempt + MotorbikeAttempt + blackListAttempt) + "\n");
        System.out.println("car spaces ocupied: " + carAttempt + "/"  + carSpot + " "+(1.0 * carAttempt/carSpot) * 100 + " %");
        System.out.println("Motorbike spaces ocupied: "+ (MotorbikeAttempt-MotorbikeSpot >=0 ? MotorbikeSpot : MotorbikeAttempt) + "/" + MotorbikeSpot + " " + (1.0 * (MotorbikeAttempt-MotorbikeSpot >=0 ? MotorbikeSpot : MotorbikeAttempt)/MotorbikeSpot) * 100 + " %");
        System.out.println("bicycles spaces ocupied: " + (bikeAttempt-bikeSpot >= 0 ? bikeSpot : bikeAttempt) + "/" + bikeSpot + " " + (1.0 * (bikeAttempt-bikeSpot >= 0 ? bikeSpot : bikeAttempt)/bikeSpot) * 100 + " %\n");
        System.out.println("cars returned: " + ((carAttempt - carSpot < 0) ? 0 : (carAttempt - carSpot)));
        System.out.println("motorbikes returned: " + ((MotorbikeAttempt - MotorbikeSpot < 0) ? 0 : (MotorbikeAttempt - MotorbikeSpot)));
        System.out.println("bicycles returned: " + ((bikeAttempt - bikeSpot < 0) ? 0 : (bikeAttempt - bikeSpot)) + "\n");
        System.out.println("blacklisted cas entrance attempted: " + blackListAttempt);
    }

    public static void logEntry(ParkingEntry entry, boolean isEntering) {
        String action = isEntering ? "is entering" : "is returned";
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String logMessage = entry.identify() + " " + action + " at " + timestamp;
        System.out.println(logMessage);
    }
}
