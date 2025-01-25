package lab07.Vehicles.Lists;

public enum companyNames {
    VITBIS, BLUEMILK,APPLE,MICROSOFT,DPD,INPOST,UPS,FEDEX,ALIEXPRESS,AMAZON;

    public static String getRandomCompanyName() {
        return values()[(int) (Math.random() * values().length)].toString();
    }
}
