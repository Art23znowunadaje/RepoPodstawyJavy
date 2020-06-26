package zadania;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {

        // 3. Stwórz program, który wpisuje do tabeli 3 wartości wprowadzone
        // z terminala i wyświetla sumę tych liczb

        Scanner scanner = new Scanner(System.in);
        System.out.println();

        int tabLenght = 4;
        int[] daneTrojkata = new int[tabLenght];
        System.out.print("Podaj pierwszy bok trójkąta: ");
        daneTrojkata[0] = scanner.nextInt();
        System.out.print("Podaj drugi bok trójkąta: ");
        daneTrojkata[1] = scanner.nextInt();
        System.out.print("Podaj trzeci bok trójkąta: ");
        daneTrojkata[2] = scanner.nextInt();
        daneTrojkata[3] = (daneTrojkata[0] + daneTrojkata[1] + daneTrojkata[2]);

        System.out.println();
        System.out.println("Boki trójkąta i suma boków wynoszą odpowiednio: ");
                for (int i = 0; i < tabLenght; i++) {
                    System.out.println(daneTrojkata[i]);
        }
    }
}
