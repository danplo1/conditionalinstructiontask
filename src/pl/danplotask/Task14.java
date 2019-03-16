package pl.danplotask;


import java.util.Scanner;

//Zad 14 Odczytaj wiek osoby i sprawdź czy osoba jest pełnoletnia czy niepełnoletnia.
public class Task14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wiek:" );
        int age = sc.nextInt();

        System.out.println(
                age>=18
                ? "Jesteś osobą pełnoletnią" :"Nie jesteś osobą pełnoletnią!");

    }
}
