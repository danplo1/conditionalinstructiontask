package pl.danplotask;

public class Task6 {

    // Zad. 6 Napisz kod, który odczytuje 3 liczby i wypisuje na ekran najmniejszą z nich.

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        int min = a<b ? a:b;

        System.out.println(c<min ? "To nie jest najmniejsza liczba": "To jest najmniejsza liczba.");

    }
}
