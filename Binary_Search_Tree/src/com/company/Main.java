package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a new tree
        BinarySearchTree<Integer> tree1 = new BinarySearchTree<Integer>();
        tree1.insert(3);
        tree1.insert(4);
        tree1.insert(-2);
        tree1.insert(-3);
        tree1.insert(23);
        tree1.insert(43);
        tree1.insert(5);
        tree1.insert(0);
        tree1.insert(-1);

        tree1.traverseInorder();

        tree1.delete(0);
        System.out.println("\nAfter delete 0");

        tree1.traverseInorder();


    }
}
