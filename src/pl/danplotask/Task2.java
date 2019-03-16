package pl.danplotask;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Zad.3  Napisz program, który sprawdza czy dana wprowadzona liczba jest podzielna przez

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę podzielną przez 3: ");
        int number = sc.nextInt();

        if (number%3==0){
            System.out.println("Liczba jest podzielna przez 3.");
        }else{
            System.out.println("Liczba nie jest podzielna przez 3");
        }
    }
}
