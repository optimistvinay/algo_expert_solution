package edu.problem.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * GIVEN TWO NON-EMPTY ARRAY ON INTERGER
 * Write a function to identify if first array is a sub sequence of first one.
 *
 * Sample input
 * array = [5,1,22,25,6,-1,8,10]
 * Sequence = [1, 6, -1, 10]
 *
 * result = true
 * */

public class ValidatSequence {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(1);
        array.add(22);
        array.add(25);
        array.add(6);
        array.add(-1);
        array.add(8);
        array.add(10);


        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(6);
        sequence.add(-1);
        sequence.add(10);
        sequence.add(11);
        sequence.add(11);
        sequence.add(11);
        sequence.add(11);

//        "array": [5, 1, 22, 25, 6, -1, 8, 10],
//        "sequence": [1, 6, -1, 10, 11, 11, 11, 11]

        boolean data = ValidatSequence.isValidSubsequence(array, sequence);

        System.out.println(data);
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.

        if(sequence.size() > array.size())
            return false;

        int i=0;
        boolean flag = false;
        for(int outerCount = 0 ; outerCount < sequence.size();outerCount++){
            if(i < array.size()){
                //System.out.println("sequence.get(outerCount) - " + sequence.get(outerCount));
                for(; i < array.size(); i++){
                    //System.out.println("array.get(i) - " + array.get(i));
                    if(sequence.get(outerCount) == array.get(i)){
                        //System.out.println("Found");
                        flag = true;
                        i++;
                        break;
                    }
                    else
                        flag = false;
                }
                if(!flag){
                    //System.out.println(sequence.get(outerCount) + " Is Not Found!!!!");
                    return flag;
                }
            }
            else{
                if(outerCount < sequence.size()){
                    return false;
                }
            }


        }
        return flag;
    }
}
