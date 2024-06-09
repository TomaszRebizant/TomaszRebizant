package pak1;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        parkingManager park = new parkingManager();
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.println("**********MENU**********");
            System.out.println("1. Dodaj auto do kolejki");
            System.out.println("2. Usun auto z parkingu");
            System.out.println("3. Wyswietl parking");
            System.out.println("4. Wyswietl kolejke");
            System.out.println("5. Wyswietl historie wjazdow");
            System.out.println("6. Wyszukaj historie wjazdow dla wybranego pojazdu");
            System.out.println("9. Wyjscie");

            String w = scan.nextLine();
            switch(w){
                case "1":
                    System.out.println("Podaj nr rejestracyjny auta: ");
                    String name = scan.nextLine();
                    park.addCar(name, park.getlist());
                    break;

                    case "2":
                        System.out.println("Podaj nr rejestracyjny auta: ");
                        String name2 = scan.nextLine();
                        park.removeCarFromParking(name2, park.getlist());
                        break;

                case "3":
                    park.printParking();
                    break;

                case "4":
                    park.printKolejka();
                    break;

                case "5":
                    park.printList();
                    break;

                case "6":
                    System.out.println("Podaj nr rejestracyjny auta: ");
                    String name3 = scan.nextLine();
                    List tmp = park.getlist();
                    for (int i = 0; i < tmp.size(); i++) {
                        ParkingSession n = ((ParkingSession) tmp.get(i));
                        if(n.getNr_rejestracycjny().equals(name3))
                        {
                            System.out.println("Numer rej: " + n.getNr_rejestracycjny() + " Data wjadu: " + n.getData_wjazdu() + " Data wyjazdu: " + n.getData_wyjazdu());
                        }

                    }
                    break;

                case "9":
                    System.out.println("Wyjscie...");
                    return;

                default:
                    System.out.println("Nie wiem");
            }
        }
    }
}