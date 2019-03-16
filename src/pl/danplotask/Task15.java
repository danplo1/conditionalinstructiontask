package pl.danplotask;


//Zad 15 Odczytaj 3 liczby i sprawdź czy jest możliwe otrzymanie z dwóch liczb trzeciej (jako
//suma)

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a: ");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b: ");
        int b = scanner.nextInt();
        System.out.println("Podaj liczbę c: ");
        int c = scanner.nextInt();

        if (a + b == c || b + c == a || c + a == b){
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }
    }
}
