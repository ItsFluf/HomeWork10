package Task1;

import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n - 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 2;
        }

        for (int i = 0; i < numbers.length; i++) {
            int p = numbers[i];
            if (p != 0) {
                for (int j = i + p; j < numbers.length; j += p) {
                    numbers[j] = 0;
                }
            }
        }

        int newSize = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers[newSize++] = numbers[i];
            }
        }

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 0; i < newSize; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
