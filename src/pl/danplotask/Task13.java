package pl.danplotask;


import java.util.Scanner;

// Sprawdź czy liczba wprowadzona jest podzielna przez 3 lub 5.
public class Task13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        int number = scanner.nextInt();

        if (number % 3 == 0 || number % 5 == 0) {
            System.out.println("Liczba jest podzielna  przez 3 lub 5");
        } else {
            System.out.println("Liczba nie jest podzielna jest przez 3 lub 5");
        }
    }
}
