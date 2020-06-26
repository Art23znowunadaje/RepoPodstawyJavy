package zadania;

import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {

        // 4. Stwórz program, który pyta użytkownika o imię i płeć,
        // i wyswietla w zależności od płci: Dzień dobry Pani <imię>
        // lub dzień dobry Panu <imię>

        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.print("Proszę podaj swoje imię: ");
        String imie = scanner.nextLine();
        System.out.print("Proszę podaj swoją płeć k lub m: ");
        String plec = scanner.nextLine();
        System.out.println();

        String zmienna = plec;
        switch (zmienna) {
            case "k":
                System.out.println("Dzień dobry Pani: " + imie);
                break;
            case "m":
                System.out.println("Dzień dobry Panu " + imie);
                break;
            default:
                System.out.println("Błąd! Ponownie uruchom program");
                break;
        }
    }

}
