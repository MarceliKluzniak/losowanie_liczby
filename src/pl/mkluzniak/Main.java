package pl.mkluzniak;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0; // deklaracja zmiennej "i"
        int los; // deklaracja zmiennej los
        int odp; // deklaracja zmiennej odpowedzi

        Random rnd = new Random(); // klasa umożliwiająca losowanie randomowej liczby
        los = rnd.nextInt(100) + 1; // ustawienie maksymalnej wartości granicznej jaką mozna wylosować. +1 na końcu jest z racji że ostatnia liczna nie jest brana pod uwagę dlatego należy dodać1.Natomiast gdy wpiszemy w zakresie 101 wtedy +1 na końcu można usunąć i zakres będzie taki sam czyli do 100.
        Scanner scanner = new Scanner(System.in); //obiekt do pobierania liczby od użytkownika.
        System.out.println("Zgadnij liczbę od 1 do 100!"); //wydrukowanie informacji do użytkownika o podanie liczby
        do {
            i++; //inkrementacja liczby i która odpowiada za ilość losowań liczby.
            System.out.println("Podaj liczbę: "); //oczekiwanie na podanie liczby
            odp = scanner.nextInt(); //zmienna sprawdzająca jaką liczbę użytkownik podał
            if (odp > los) { //pętla 'if' sprawadza liczbę wylosowaną. Tutaj jesli użytkownik podał liczbę większą od wylosowanej
                System.out.println("Niestety nie zgadłeś! Moja liczba jest mniejsza."); //wydrukowanie na ekranie że wylosowana liczba jest mniejsza
            } else if (odp < los) { //kontynuacja pętli 'if' sprawdzająca wylosowaną liczbę. Tutaj jesli użytkownik podał liczbę mniejszą od wylosowanej
                System.out.println("Niestety nie zgadłeś! Moja liczba jest większa."); //wydrukowanie na ekranie że wylosowana liczba jest większa
            }

        } while (odp != los); //koniec pętli gdy odp jest różna od losu
        System.out.println("Brawo! Udało Ci się to za " + i + " razem! Gratuluję!"); //Wydrukowanie zakończnia programu i dodanie zmiennej 'i' która liczyła ilość prób zgadnięcia liczby
    }
}
