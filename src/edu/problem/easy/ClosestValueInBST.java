package edu.problem.easy;

/**
 * Write a function that takes a binary search tree BST and target integer value and return the closest value to that target value contains in the BST.
 * you can assume that there will be one closest value.
 * each BST node has integer value a left child node and right child node a node. A node is said to be valid BST node if and only if it satisfies the BST properties.
 */

public class ClosestValueInBST {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

        BST bst14 = new BST(14);
        BST bst13 = new BST(13);
        BST bst15 = new BST(15);
        BST bst22 = new BST(22);
        BST bst10 = new BST(10);
        BST bst1 = new BST(1);
        BST bst2 = new BST(2);
        BST bst5 = new BST(5);
        BST bst6 = new BST(6);

        bst10.left = bst5;
        bst10.right = bst15;

        bst5.left = bst2;
        bst5.right = bst6;

        bst2.left = bst1;

        bst15.left = bst13;
        bst15.right = bst22;

        bst13.right = bst14;


        int result = findClosestValueInBst(bst10, 15);
        System.out.println(result);




    }

    public static int findClosestValueInBst(BST tree, int target) {

        return findClosestValueInBstHelper(tree, target, tree.value);
    }

    private static int findClosestValueInBstHelper(BST tree, int target, int closest) {
        if(tree == null)
            return closest;

        if(Math.abs(target - closest) > Math.abs(target - tree.value))
            closest = tree.value;

        if(target < tree.value){
            //go left
            return findClosestValueInBstHelper(tree.left, target, closest);
        }
        else if (target > tree.value){
            //go right
            return findClosestValueInBstHelper(tree.right, target, closest);
        }
        else{
            return closest;
        }

    }


}
