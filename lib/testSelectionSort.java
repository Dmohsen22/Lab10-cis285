

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.Test;

public class testSelectionSort {

@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}

public testSelectionSort() {
}

public void testPositive(){
    int[] arr = new int[5];
arr[0] = 8;
arr[1] = 9;
arr[2] = 7;
arr[3] = 10;
arr[4] = 2;

int[] Sortedarr = new int[5];
Sortedarr[0] = 2;
Sortedarr[1] = 7;
Sortedarr[2] = 8;
Sortedarr[3] = 9;
Sortedarr[4] = 10;
}

public void testNegative() {
    int[] arr = {-2, -4, -10, -11, -8};
    int[] sortedArr = {-11, -10, -8, -4, -2};
    SelectionSort.basicSelectionSort(arr);
    assertArrayEquals(sortedArr, arr);
    }

public void testMixed() {
    int[] arr = {3, -3, 0, 5, -9};
    int[] sortedArr = {-9, -3, 0, 3, 5};
    SelectionSort.basicSelectionSort(arr);
    assertArrayEquals(sortedArr, arr);
    }

public void testDuplicates() {
    int[] arr = {-4, -3, 9, 5, 5};
    int[] sortedArr = {-4, -3, 5, 5, 9};
    SelectionSort.basicSelectionSort(arr);
    assertArrayEquals(sortedArr, arr);
    }



}


