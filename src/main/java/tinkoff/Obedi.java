package tinkoff;

import java.util.Scanner;

public class Obedi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // количество обедов

        if (!(0 <= n || n <= 100)) {
            return;
        }

        int [] mass = new int[n]; // стоимость обедов
        int [] result = new int[n]; // результат рост учеников

        for (int i = 0; i < n; i++) {
            mass[i] = in.nextInt();
            if (!(0 <= mass[i] || mass[i] < 300)) {
                return;
            }
        }


    }
}
