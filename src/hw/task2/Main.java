package hw.task2;

import java.util.Arrays;

/**
 * Task 2
 * @author Polina Fandorina
 */

public class Main {
    static void sortirovka(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1]) {
                int k = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = k;
                count++;
            }
        if (count > 0) {
            sortirovka(arr);
        }
    }

    public static void main(String[] args) {
        int[] myArray = {5,6,3,2,5,1,4,9};
        sortirovka(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}