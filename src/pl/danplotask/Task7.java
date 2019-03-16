package pl.danplotask;

import java.util.Scanner;

public class Task7 {

    // Zad. 7 Odczytaj wyraz i sprawdź czy ostatnia litera to M bądź m.

    public static void main(String[] args) {

        String m1 = "M";
        String m2 = "m";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String word = scanner.next();


        if (word.endsWith(m1)) {
            System.out.println("Wyraz posiada końcówkę z dużą literą " + m1);
        } else if (word.endsWith(m2)) {
            System.out.println("Wyraz posiada końcówkę z małą literą " + m2);
        } else {
            System.out.println(" Wyraz nieposiada końcówki z literą " + m1 + " lub " + m2);
        }
    }

}
