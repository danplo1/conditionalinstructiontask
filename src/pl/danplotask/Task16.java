package pl.danplotask;


import java.util.Scanner;

/**Mówimy, że osoba jest w wieku nastolatka jeśli ma pomiędzy 13 a 18 lat.
 Odczytaj 2 liczby oznaczające wiek dwóch osób, wypisz komunikat TAK jeśli 2
 osoby są w wieku nastolatka oraz nie jeśli nie są w odpowiednim wieku.
 * */
public class Task16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek 1 osoby: ");
        int person1 = scanner.nextInt();
        System.out.println("Podaj wiek 2 osoby: ");
        int person2 =scanner.nextInt();

        if (person1 >=13 && person1<=18 && person2>=13 && person2<=18){
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }
    }
}
