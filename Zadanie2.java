package zadania;

public class Zadanie2 {

    public static void main(String[] args) {

        // 2. Stwórz program, który wyświetla liczby podzielne po 3 mniejsze niż 100

        System.out.println();
        System.out.println("Liczby podzielne przez 3.");
        System.out.println();
            for (int i = 1; i < 100; i++) {
                // i = 1 odliczam od 1, które będzie dzielone przez 3
                // ustalam, że dzielenie przez 3 ma być do poniżej 100
                // i++ inkrementacja spowoduje, że będzie iteracja dzielenia przez 3
                // dla każdej kolejnej liczby
            if (i % 3 == 0) {
                // warunek: gdy reszta z dzielenia przez 3 będzie 0,
                // wówczas wydrukuje się w sout liczba podzielna przez 3
                System.out.println(i + " jest podzielne przez 3");
            }

        }
        }
    }