package lab3;
import java.math.*;
public class zad4 {
    public static void main(String[] args) {
        double wynik = 0.0;
        for(int n=1;n<10000;n++)
        {
            wynik *=((2.0*n)/(2*n)-1)*((2*n)/(2*n)+1);
        }
        System.out.println(wynik*2);
        System.exit(0);
    }
}
