package Task2;

import java.util.Scanner;

public class Solve {
    public static Scanner reader = new Scanner(System.in);

    public static int[] getArray(int arrayLength){
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter value number " + (i+1) + ": ");
            array[i] = reader.nextInt();
        }
        return array;
    }

    public static void printTriple(int[] array){
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i + 2] - array[i + 1] == array[i + 1] - array[i]) {
                System.out.println("Found: " + array[i] + ", " + array[i + 1] + ", " + array[i + 2]);
                return;
            }
        }
        System.out.println("No valid triplet found.");
    }

    public static void main(String[] args) {
        System.out.print("Please give me the length of the array: ");
        int arrayLength = reader.nextInt();
        int[] arr2 = getArray(arrayLength);
        printTriple(arr2);
    }
}
