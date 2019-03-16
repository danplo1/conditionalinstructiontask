package pl.danplotask;

import java.util.Scanner;

public class Task5 {

    //Zad.5 Popraw dany kod, aby wypisywał liczbę największą, a nie najmniejszą.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = a<b ? a:b;
        System.out.println(max);


    }
}
