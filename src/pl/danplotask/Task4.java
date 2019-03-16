package pl.danplotask;

import java.util.Scanner;

public class Task4 {

    //Zad.4 Napisz program, który odczytuje wyraz i sprawdza czy wprowadzone imię jest męskie czy żeńskie.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name = sc.next();

        System.out.println(name.endsWith("a")&& !name.equals("Kuba")
                && !name.equals("Kosma")
                ?"Podałeś imię żenskie"
                :"Podałeś imię męskie");

    }

}
