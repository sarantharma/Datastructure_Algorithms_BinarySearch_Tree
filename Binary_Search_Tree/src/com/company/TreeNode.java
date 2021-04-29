package com.company;

public class TreeNode<T extends Comparable<T>>{
    private T data; // The data saved
    private TreeNode<T> leftChild;
    private TreeNode<T> rightChild;

    public TreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }


    // Insert a node into the Tree
    public void insert(T value){
        if(data.compareTo(value) == 0){
            return;
        }
        if(data.compareTo(value) > 0){
            if(leftChild == null){
                leftChild = new TreeNode<>(value);
            }else{
                leftChild.insert(value);
            }
        }else{
            if(rightChild == null){
                rightChild = new TreeNode<>(value);
            }else{
                rightChild.insert(value);
            }
        }

    }

    // Get the Node of the value passed
    public TreeNode<T> get(T value){
        if(data.compareTo(value) == 0){
            return this;
        }
        if(data.compareTo(value) > 0){
            return leftChild.get(value);
        }else{
            return rightChild.get(value);
        }
    }

    public void traverseInorder(){
        if(leftChild != null){
            leftChild.traverseInorder();
        }
        System.out.println("Value = " + data + ", ");
        if(rightChild != null){
            rightChild.traverseInorder();
        }
    }

    public TreeNode<T> min(){
        if(leftChild == null){
            return this;
        }
        else{
            return  leftChild.min();
        }
    }



//    @Override
//    public int compareTo(TreeNode o) {
//        if((int)this.data > (int)o.data){
//            return 1;
//        }else if((int)this.data < (int)o.data){
//            return -1;
//        }else{
//            return 0;
//        }
//    }
}
