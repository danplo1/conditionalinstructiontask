package pl.danplotask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //Zad.1  Napisz program, który sprawdzi czy wprowadzona liczba jest większa od 5.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();

        if (number>5){
            System.out.println("Podana liczba jest większa od 5!");
        }else{
            System.out.println("Podana liczba jest mniejsza od 5!");
        }

    }
}
