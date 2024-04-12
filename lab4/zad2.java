package lab4;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args)
    {
        System.out.println("Podaj liczbę: ");
        Scanner scan = new Scanner(System.in);
        int liczba = Integer.parseInt(scan.nextLine());
        int size = String.valueOf(liczba).length();
        char[] tab2 = new char[size];
        for(int i = 0; i<size; i++)
        {
            tab2[i] = String.valueOf(liczba).charAt(i);
        }
        for(int i = size -1; i>=0; i--)
        {
            System.out.print(tab2[i]);
        }
    }
}
