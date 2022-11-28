package edu.problem.easy;

import java.util.Arrays;

public class NonConstructibleChange {

    public static void main(String[] args) {

        //int[] data = {5,7,1,1,2,3,22};
        int[] data = {1,2,5};
        int result = nonConstructibleChange(data);
        System.out.println(result);
    }

    public static int nonConstructibleChange(int[] coins) {

        Arrays.sort(coins);
        int currentChange =0;

        for (int i = 0; i < coins.length; i++) {

            if(coins[i] > currentChange +1){
                return currentChange + 1;
            }
            currentChange += coins[i];
        }
        return currentChange + 1;
    }
}
