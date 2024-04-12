package lab4;

public class zad4 {
    public static void main(String[] args)
    {
        for (int i = 2; i < 1000; i++) {
            int[] dziel = dzielniki(i);
        int suma = 0;
        for (int k = 0; k < i; k++) {
            suma += dziel[k];

        }
        if(suma== i)
        {
            System.out.println("Liczba "+ i + " jest doskonała");
        }
        }
    }
    public static int[] dzielniki(int liczba)
    {
        int[] dzielniki = new int[liczba];
         dzielniki[0] = 1;
         int zajeteTablice = 1;
        for(int i = 2; i < liczba; i++){
            if (liczba%i == 0) {
                dzielniki[zajeteTablice] = i;
                zajeteTablice ++;
            }
        }
        return dzielniki;
    }
}
