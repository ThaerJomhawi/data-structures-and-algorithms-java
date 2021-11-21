/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test void insertionSort() {
        // empty array
        int[]  emptyArr = {};
        assertEquals(emptyArr, App.insertionSort(emptyArr));

        // one Element Array
        int[]  oneElementArr = {8};
        assertEquals("[8]", Arrays.toString(App.insertionSort(oneElementArr)));

        // regular array
        int[]  regularArr = {8,4,23,42,16,15};
        assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(App.insertionSort(regularArr)));

        // Reverse-sorted
        int[]  ReverseSortedArr = {20,18,12,8,5,-2};
        assertEquals("[-2, 5, 8, 12, 18, 20]", Arrays.toString(App.insertionSort(ReverseSortedArr)));

        // Few uniques array
        int[]  FewUniquesArr = {5,12,7,5,5,7};
        assertEquals("[5, 5, 5, 7, 7, 12]", Arrays.toString(App.insertionSort(FewUniquesArr)));

        // Nearly-sorted array
        int[]  NearlySortedArr = {2,3,5,7,13,11};
        assertEquals("[2, 3, 5, 7, 11, 13]", Arrays.toString(App.insertionSort(NearlySortedArr)));
    }

    @Test void mergeSort() {
        // empty array
        int[]  emptyArr = {};
        assertEquals(emptyArr, App.mergeSort(emptyArr));

        // one Element Array array
        int[]  oneElementArr = {8};
        assertEquals("[8]", Arrays.toString(App.mergeSort(oneElementArr)));

        // regular array
        int[]  regularArr = {8,4,23,42,16,15};
        assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(App.mergeSort(regularArr)));

        // Reverse-sorted
        int[]  ReverseSortedArr = {20,18,12,8,5,-2};
        assertEquals("[-2, 5, 8, 12, 18, 20]", Arrays.toString(App.mergeSort(ReverseSortedArr)));

        // Few uniques array
        int[]  FewUniquesArr = {5,12,7,5,5,7};
        assertEquals("[5, 5, 5, 7, 7, 12]", Arrays.toString(App.mergeSort(FewUniquesArr)));

        // Nearly-sorted array
        int[]  NearlySortedArr = {2,3,5,7,13,11};
        assertEquals("[2, 3, 5, 7, 11, 13]", Arrays.toString(App.mergeSort(NearlySortedArr)));
    }

    @Test void quickSort() {
        // empty array
        int[]  emptyArr = {};
        assertEquals(emptyArr, App.quickSort(emptyArr,0,emptyArr.length-1));

        // one Element Array array
        int[]  oneElementArr = {8};
        assertEquals("[8]", Arrays.toString(App.quickSort(oneElementArr,0,oneElementArr.length-1)));

        // regular array
        int[]  regularArr = {8,4,23,42,16,15};
        assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(App.quickSort(regularArr,0,regularArr.length-1)));

        // Reverse-sorted
        int[]  ReverseSortedArr = {20,18,12,8,5,-2};
        assertEquals("[-2, 5, 8, 12, 18, 20]", Arrays.toString(App.quickSort(ReverseSortedArr,0,ReverseSortedArr.length-1)));

        // Few uniques array
        int[]  FewUniquesArr = {5,12,7,5,5,7};
        assertEquals("[5, 5, 5, 7, 7, 12]", Arrays.toString(App.quickSort(FewUniquesArr,0,FewUniquesArr.length-1)));

        // Nearly-sorted array
        int[]  NearlySortedArr = {2,3,5,7,13,11};
        assertEquals("[2, 3, 5, 7, 11, 13]", Arrays.toString(App.quickSort(NearlySortedArr,0,NearlySortedArr.length-1)));
    }
}