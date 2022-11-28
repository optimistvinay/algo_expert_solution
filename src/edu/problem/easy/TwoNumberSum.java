package edu.problem.easy;

/*
* input - 1 array of distinct integer and integer representing target sum
* Problem  - If two numbers in input array sum up to the target sum then function should return an array of those two number
*            if two numbers in input array does not sum up to the target sum then function should return an empty array
* */

public class TwoNumberSum {

    public static void main(String[] args) {
        int[] input = {3,5,-4,11,1,-1,6};
        int targetSum =10;
        int[] result = TwoNumberSum.twoNumberSum(input, targetSum);
        System.out.println(result[0] + "  " + result[1]);
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // check the size of the array is nt empty

        int firstNumber = 0;
        int secondNumber = 0;
        boolean targetSumFound = false;

        for(int counter = 0; counter < array.length; counter++){
            firstNumber = array[counter];
            for(int nextCounter=counter+1; nextCounter<array.length; nextCounter++){
                secondNumber = array[nextCounter];
                if(firstNumber+secondNumber == targetSum){
                    return new int[] {firstNumber, secondNumber};
                }
            }
        }
        return new int[0];
    }
}
