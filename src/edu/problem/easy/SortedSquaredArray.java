package edu.problem.easy;

/*
* Return array of Squar of the each element of the original array
*
*
*/

import java.util.Arrays;

public class SortedSquaredArray {

    public static void main(String[] args) {

        //int[] originalArray = {1,2,3,4,5,6};
        int[] originalArray = {-6, -2};
        int[] result = SortedSquaredArray.sortedSquaredArray(originalArray);
        System.out.println(result);
    }

    public static int[] sortedSquaredArray(int[] array) {

        int[] result = new int[array.length];
        for(int counter =0;  counter < array.length; counter++){
            int number = array[counter];
            result[counter] = number * number;
        }

        Arrays.sort(result);

        return result;
    }
}
