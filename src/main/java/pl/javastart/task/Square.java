package pl.javastart.task;

import java.util.Scanner;

public class Square {

    int[] createArray(int sizeOfArray) {
        return new int[sizeOfArray];
    }

    void fillArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    void sumOfArray(int[] array) {
        int sumOfArray = 0;
        for (int element : array) {
            sumOfArray += Math.pow(element, 2);
        }
        System.out.printf("Suma kwadratów wprowadzonych liczb to %d", sumOfArray);
    }
}
