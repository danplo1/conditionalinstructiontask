package pl.danplotask;

import java.util.Scanner;

/**Zad. 10
 * Napisz program, który odczytuje słowo i sprawdza czy dany String jest poprawnym
 * adresem url. Zakładamy, że adres url jest postaci http://www.wp.pl bądź postaci
 * https://www.wp.pl bądź postaci www.wp.pl
 */
public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres strony: ");
        String word = scanner.next();

        if (word.startsWith("https://")
            || word.startsWith("http://")
            || word.startsWith("www.")){
            System.out.println("Podany adres jest poprawny");
        } else {
            System.out.println("Podany adres nie jest poprawny");
        }

    }


}
