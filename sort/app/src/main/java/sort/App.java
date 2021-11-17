/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[]  arr = {8,4,23,42,16,15};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }


    public static int[] mergeSort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
            int mid = n / 2;
            int[] left = new int[mid];
            for (int i = 0; i < left.length; ++i) {
                left[i] = arr[i];
            }
            int[] right = new int[n - mid];
            for (int j = 0; j < right.length; ++j) {
                right[j] = arr[j + mid];
            }
            mergeSort(left);
            mergeSort(right);
            marge(left, right, arr);
        }
        return arr;
    }

    public static void marge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i = i + 1;
            } else {
                arr[k] = right[j];
                j = j + 1;
            }
            k = k + 1;
        }
        if (i == left.length) {
            for (int l = j; l < right.length; l++) {
                arr[k++] = right[l];
            }
        } else {
            for (int l = i; l < left.length; l++) {
                arr[k++] = left[l];
            }
        }
    }
}


