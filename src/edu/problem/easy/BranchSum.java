package edu.problem.easy;

import java.util.ArrayList;
import java.util.List;


/*
* Time O(n)
* Space O(n)
*
* */
public class BranchSum {

    public static void main(String[] args) {

        BinaryTree bst1 = new BinaryTree(1);
        BinaryTree bst2 = new BinaryTree(2);
        BinaryTree bst3 = new BinaryTree(3);
        BinaryTree bst4 = new BinaryTree(4);
        BinaryTree bst5 = new BinaryTree(5);
        BinaryTree bst6 = new BinaryTree(6);
        BinaryTree bst7 = new BinaryTree(7);
        BinaryTree bst8 = new BinaryTree(8);
        BinaryTree bst9 = new BinaryTree(9);
        BinaryTree bst10 = new BinaryTree(10);

        bst1.left = bst2;
        bst1.right= bst3;

        bst2.left = bst4;
        bst2.right = bst5;

        bst3.left = bst6;
        bst3.right = bst7;

        bst4.left = bst8;
        bst4.right = bst9;

        bst5.left = bst10;


        List<Integer> result = branchSums(bst1);

    }

    public static List<Integer> branchSums(BinaryTree root) {


        List<Integer> result = new ArrayList<>();
        calculateBranchSum(root, 0, result);
        return result;
    }

    public static void calculateBranchSum(BinaryTree root, Integer runningSum, List<Integer> sum){

        Integer newRunningSum = runningSum + root.value;

        //If this is leaf node
        if(root.left == null && root.right ==null){
            sum.add(newRunningSum);
            return;
        }

        if(root.left != null)
            calculateBranchSum(root.left, newRunningSum, sum);

        if(root.right != null)
            calculateBranchSum(root.right, newRunningSum, sum);

    }

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
