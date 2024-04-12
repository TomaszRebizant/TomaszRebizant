package lab4;

public class zad1 {
    public static void main(String[] args)
    {
        for(int i = 2 ; i < 1000; i++)
        {
            if(czyPierwsza(i)==i)
            {
                if(czyPierwsza(i+2)==i+2)
                {
                    System.out.println(i + " " + (i+2));
                }
            }
        }
    }
        public static int czyPierwsza(int liczba)
        {
            boolean pierwsza = true;
            for(int i = 2; i<liczba; i++)
            {
                if(liczba%i==0)
                {
                    pierwsza = false;
                    break;
                }
            }
            if(pierwsza)
            return liczba;
            else return 0;
        }
}
