package com.dsimon;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array));
	    reverse(array);
        System.out.println(Arrays.toString(array));

        int[] secondArray = {1, 2, 3, 4};
        System.out.println(Arrays.toString(secondArray));
        reverse(secondArray);
        System.out.println(Arrays.toString(secondArray));

    }

    private static void reverse(int[] array) {
        int firstCounter = 0;
        int lastCounter = array.length - 1;

        while (firstCounter < lastCounter) {
            int tempNumber = array[firstCounter];
            array[firstCounter] = array[lastCounter];
            array[lastCounter] = tempNumber;
            firstCounter++;
            lastCounter--;
        }
    }
}
