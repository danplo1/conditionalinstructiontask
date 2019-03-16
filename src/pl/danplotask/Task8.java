package pl.danplotask;

import java.util.Scanner;

public class Task8 {

    /*Zad. 8 Odczytaj wprowadzony wyraz przez użytkownika i sprawdź czy pierwsza litera
    wyrazu jest taka sama jak ostatnia. Wpisz odpowiedni komunikat.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String word = scanner.next();

        int lenght =  word.length();
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(-1);

        if (firstLetter==lastLetter){
            System.out.println("Pierwsza i ostatnia litera są takie same!");
        }else{
            System.out.println("Pierwsza i ostatnia litera nie są takie same!");
        }

    }
}
