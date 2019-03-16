package pl.danplotask;

import java.util.Scanner;

/**
 * Zad. 12 Napisz program, który sprawdza czy wprowadzony wyraz jest kodem pocztowym.
 * Kod pocztowy musi być w formacie 87-630.
 * */
public class Task12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Prowadz wyraz: ");
        String word = scanner.next();

        if (word.length()==6 && Character.isDigit(word.charAt(0))
                && Character.isDigit(word.charAt(1))
                && word.charAt(2)=='-'
                && Character.isDigit(word.charAt(3))
                && Character.isDigit(word.charAt(4))
                && Character.isDigit(word.charAt(5))){
            System.out.println("Wpisany kod jest poprawny");
        }else{
            System.out.println("Wpisany kod nie jest poprawny");
        }
    }
}
