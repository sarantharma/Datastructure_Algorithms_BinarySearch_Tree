package com.company;

public class BinarySearchTree<T extends Comparable<T>> {
    private TreeNode<T> root;

    public void insert(T data){
        if(root == null){
            root = new TreeNode<T>(data);
        }else{
            root.insert(data);
        }
    }

    public TreeNode<T> get(T value){
        if(root != null){
            root.get(value);
        }
        return null;
    }

    public void traverseInorder(){
        if(root != null){
            root.traverseInorder();
        }
    }

    public TreeNode<T> min(){
        if(root == null){
            return null;
        }else{
            return root.min();
        }
    }

    public void delete(T value){
        root = delete(root, value);
     }


    private TreeNode<T> delete(TreeNode<T> subtreeRoot, T value) {
        if(subtreeRoot == null){
            return null;
        }
        if(value.compareTo(subtreeRoot.getData()) < 0){
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }
        else if(value.compareTo(subtreeRoot.getData()) > 0){
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        }else{
            // node to delete has 0 or 1 child(ren)
            if(subtreeRoot.getLeftChild() == null){
                return subtreeRoot.getRightChild();
            }
            else if(subtreeRoot.getRightChild() == null){
                return subtreeRoot.getLeftChild();
            }
            // node to delete has 2 children
            subtreeRoot.setData(subtreeRoot.getRightChild().min().getData());
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
        }
        return subtreeRoot;
    }

    }
