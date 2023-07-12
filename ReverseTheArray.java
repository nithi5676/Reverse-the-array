package reverseTheArray;

import java.util.Scanner;

public class ReverseTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = scanner.nextInt();
        System.out.println("Enter Elements into the Array");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        ReverseTheArray reversetherange = new ReverseTheArray();
        reversetherange.reverse(array, size);

    }

    public void reverse(int array[], int size) {
        int temporary;
        int i = 0;
        int j = size - 1;
        while (i < j) {
            temporary = array[i];
            array[i] = array[j];
            array[j] = temporary;
            i++;
            j--;

        }
        for (int k = 0; k < size; k++) {
            System.out.print(array[k] + " ");
        }
    }

}