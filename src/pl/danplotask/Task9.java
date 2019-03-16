package pl.danplotask;


import java.util.Scanner;

/**Zad. 9
 * Odczytaj 2 wyrazy i sprawdź czy wprowadzone wyrazy są równe. Dla wywołania:
 * Ala Ala Wynikiem powinno być tak.
 *
 * Dla wywołania:
 * Ala Sak
 * Wynikiem powinno być nie.
 */

public class Task9 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz 1: ");
        String word1 = scanner.next();
        System.out.println("Podaj wyraz 2: ");
        String word2 = scanner.next();

        if (word1.equals(word2)){
            System.out.println("Wyrazy są równe");
        }else{
            System.out.println("Wyrazy nie są równe");
        }

        //lub
        System.out.println(word1.equals(word2)? "Wyrazy są równe" : "Wyrazy nie są równe");
    }
}
