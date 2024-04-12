package lab4;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args)
    {
        System.out.println("Podaj liczbę: ");
        Scanner scan = new Scanner(System.in);
        int liczba = Integer.parseInt(scan.nextLine());
         int[] tab = new int[100];
        for(int i= 0; liczba != 0 ; i++)
        {
            tab[i] =liczba%2;
            liczba = liczba/2;
        }
        System.out.println("Liczba w systemie binarnym: ");
        for(int i = 99; i>=0; i--)
        {
            if(tab[i] == 1)
            {
                for(int j = i; j>=0; j--)
                {
                    System.out.print(tab[j]);
                }
                break;
            }
        }

    }
}
