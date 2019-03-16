package pl.danplotask;

import java.util.Scanner;

public class Task3 {

    //Zad.3 Napisz program, który odczytuje wyraz i sprawdza czy wprowadzony wyraz to Akademia.

    public static void main(String[] args) {

        String password = "Akademia";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String word = scanner.next();

        if(word.equals(password)){
            System.out.println("Podałeś prawidłowe hasło!");
        }else {
            System.out.println("Nie podałeś prawidłowego hasła!");
        }

        //lub
        System.out.println(word.equals(password)?"Podałeś prawidłowe hasło!":"Nie podałeś prawidłowego hasła!");

    }

}
