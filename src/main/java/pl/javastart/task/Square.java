package pl.javastart.task;

import java.util.Scanner;

public class Square {
    private int[] array;
    private int sumOfArray;

    void run(Scanner scanner) {
        System.out.println("Podaj rozmiar tablicy:");
        createArray(scanner.nextInt());
        System.out.printf("Wprowadź %d liczb:\n", array.length);
        fillArray();
        sumOfArray();
    }

    private void createArray(int sizeOfArray) {
        array = new int[sizeOfArray];
    }

    private void fillArray() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    private void sumOfArray() {
        for (int element : array) {
            sumOfArray += Math.pow(element, 2);
        }
        System.out.printf("Suma kwadratów wprowadzonych liczb to %d", sumOfArray);
    }
}
