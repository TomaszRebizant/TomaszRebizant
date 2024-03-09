package lab3;

public class zad3 {
    public static void main(String[] args)
    {
        double wynik = 0;
        for(int n = 0; n<100000; n++){
            wynik+=(Math.pow(-1.0,n))/((2*n)+1);
        }
        System.out.println(wynik*4);
        System.exit(0);
    }
    }

