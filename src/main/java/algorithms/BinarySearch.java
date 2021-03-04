package algorithms;

import java.util.Random;

public class BinarySearch {

    public static void main(String[] args) {

        int countMas = 1;
        int[] mas = new int[countMas];

//        Random random = new Random();
//        for(int i = 0; i < countMas; i++){
//            mas[i] = random.nextInt(countMas * 2);
//        }

        for(int i = 0; i < countMas; i++) {
            mas[i] = i * 2;
        }


        printMas(mas);
        bubbleSort(mas);
        printMas(mas);

        int index = binarySearch(mas, 18);
        System.out.println("index:" + index);
    }

    private static int binarySearch(int[] mas, int key) {
        int low = 0;
        int high = mas.length -1;
        int index = -1;
        int middle = (high - low) / 2;
        int count = 0;

        while (low <= high) {
            count++;
            if (mas[middle] > key) {
                high = middle;
                middle = middle - ((high - low) / 2);
            } else if (mas[middle] < key) {
                low = middle;
                middle = middle + ((high - low) / 2);
            } else if (mas[middle] == key) {
                index = middle;
                break;
            }
            if (high - low == 1 || high - low == 0) {
                if (mas[high] == key) {
                    index = high;
                } else if (mas[low] == key) {
                    index = low;
                }
                break;
            }
            System.out.println("low:" + low);
            System.out.println("middle:" + middle);
            System.out.println("high:" + high);

            System.out.println("index:" + index);
            System.out.println();
        }

        System.out.println("count:" + count);
        return index;
    }

    private static void bubbleSort(int[] mas) {
        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    int min = mas[j + 1];
                    mas[j + 1] = mas[j];
                    mas[j] = min;
                }
            }
        }
    }

    private static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print("[" + i + "]   ");
        }
        System.out.println();

        for (int ma : mas) {
            System.out.print(ma + "     ");
        }
        System.out.println();

    }
}
