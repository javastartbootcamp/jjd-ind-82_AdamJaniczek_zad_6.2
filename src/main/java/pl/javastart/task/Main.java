package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Square square = new Square();
        System.out.println("Podaj rozmiar tablicy:");
        int[] array = square.createArray(scanner.nextInt());
        System.out.printf("Wprowadź %d liczb:\n", array.length);
        square.fillArray(array);
        square.sumOfArray(array);
    }
}
