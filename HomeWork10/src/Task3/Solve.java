package Task3;

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

    public static void printArray(int[] A) {
        System.out.print("[");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (i < A.length - 1) {
                System.out.print(", "); // Add commas between elements
            }
        }
        System.out.println("]"); // Close the bracket
    }

    public static int[] modifyArray(int[] array){
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i-1];
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.print("Please give me the the arrays length: ");
        int arrLength = reader.nextInt();
        int[] arr = getArray(arrLength);
        int[] newArr = modifyArray(arr);
        printArray(newArr);
    }
}
