package pl.danplotask;

import java.util.Scanner;

public class Task11 {

    // Zad. 11 Odczytaj dane słowo sprawdź czy słowo zawiera wyraz kajak.

    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String word = scanner.next();
        String secretWord ="kajak";

        if (word.contains(secretWord)){
            System.out.println("Wyraz zawiera: " + secretWord);
        }else{
            System.out.println("Wyraz nie zawiera: " + secretWord);
        }

    }

}
