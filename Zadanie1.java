package zadania;

public class Zadanie1 {

    public static void main(String[] args) {

        // 1. Stwórz program, który do tabeli wpisuje wszystkie potęgi 5 od 0 do 9

        System.out.println();
        System.out.println("Program, który do tabeli wpisuje wszystkie potęgi 5 od 0 do 9");
        System.out.println();

        int[] tablicaWynikow = new int[10]; // deklaruję tablicę o zawartości 10 elementów

        int podstawa = 5;
        int result = 1;
        System.out.println("Tablica wyników potęgowania: ");
        for (int i = 0; i < 9; i++) {
            result = result * podstawa;
            tablicaWynikow[i] = result;

            System.out.println(tablicaWynikow[i]);
        }
        /*System.out.println();
        for (int elem : tablicaWynikow) {
            System.out.println(elem);
        }*/
        // elem to nowa zmienna lokalna
            }
        }