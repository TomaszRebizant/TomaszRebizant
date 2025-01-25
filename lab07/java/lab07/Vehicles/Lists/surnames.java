package lab07.Vehicles.Lists;

public enum surnames {
    SMITH, JOHNSON, WILLIAMS, BROWN, JONES, GARCIA, MILLER , REBIZANT, KOWALSKI, NOWAK, WOJCIECHOWSKI, KOWAL, KRAWCZYK, KRAWIEC;

    public static String getRandomSurname() {
        return values()[(int) (Math.random() * values().length)].toString();
    }
}
