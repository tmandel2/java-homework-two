package com.timhomework;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
    };

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insert(int data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
        }else{
            Node currentNode = root;
                while (currentNode.getRight() != null && currentNode.getLeft() != null) {
                    if (data < currentNode.getData()) {
                        currentNode = currentNode.getLeft();
                    } else {
                        currentNode = currentNode.getRight();
                    }
                }
                while (currentNode.getRight() != null && currentNode.getData() <= data) {
                    currentNode = currentNode.getRight();
                }
                while (currentNode.getLeft() != null && currentNode.getData() >= data) {
                    currentNode = currentNode.getLeft();
                }
                if(currentNode.getData() > data) {
                    currentNode.setLeft(newNode);
                } else {
                    currentNode.setRight(newNode);
                }
        }
    }
}
