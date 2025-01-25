package lab07.Vehicles.Lists;
public enum plates {
    DZLMG01, DZLMG02, DZLMG03, DZLMG04, DZLMG05, DZLMG06, DZLMG07, DZLMG08, DZLMG09, DZLMG10;

    public static String getRandomPlate() {
        return values()[(int) (Math.random() * values().length)].toString();
    }
}
