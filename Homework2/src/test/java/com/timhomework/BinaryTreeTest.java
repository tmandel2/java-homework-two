package com.timhomework;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeTest {


    @Test
    public void BinaryTreeNoRootIsNull(){
        BinaryTree myTree = new BinaryTree();

        assertEquals("root isn't null", myTree.getRoot(), null);
    }

    @Test
    public void CanInsertNode(){
        BinaryTree myTree = new BinaryTree();
        myTree.insert(5);
        myTree.insert(3);
        myTree.insert(7);
        assertEquals("Did not insert first Node", 5, myTree.getRoot().getData());
        assertEquals("Did not insert left", 3, myTree.getRoot().getLeft().getData());
        assertEquals("Did not insert right", 7, myTree.getRoot().getRight().getData());
    }

    @Test
    public void InsertTest() {
        BinaryTree myTree = new BinaryTree();
        myTree.insert(7);
        myTree.insert(5);
        myTree.insert(9);
        myTree.insert(11);
        assertEquals("Not right of right", 11, myTree.getRoot().getRight().getRight().getData());
        myTree.insert(13);
        assertEquals("Not right of right of right", 13, myTree.getRoot().getRight().getRight().getRight().getData());
        myTree.insert(4);
        assertEquals("Not left of left", 4, myTree.getRoot().getLeft().getLeft().getData());
        myTree.insert(10);
        assertEquals("not left of right of right", 10, myTree.getRoot().getRight().getRight().getLeft().getData());
        myTree.insert(2);
        assertEquals("not left of left of left", 2, myTree.getRoot().getLeft().getLeft().getLeft().getData());
        myTree.insert(3);
        assertEquals("not right of left of left of left", 3, myTree.getRoot().getLeft().getLeft().getLeft().getRight().getData());
        myTree.insert(18);
        assertEquals("not right of right of right of right", 18, myTree.getRoot().getRight().getRight().getRight().getRight().getData());
        myTree.insert(17);
        assertEquals("not left of right of right of right of right", 17, myTree.getRoot().getRight().getRight().getRight().getRight().getLeft().getData());
        myTree.insert(6);
        assertEquals("not right of left", 6, myTree.getRoot().getLeft().getRight().getData());

    }
}

