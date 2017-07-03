package org.nodexy.structs;

/**
 * Created by phoenix on 2/16/17.
 */
public class Tree <T> {
    private Node root;

    public Tree() {
        root = null;
    }

    public void add(T value) {
        if (root == null) {
            Node node = new Node(value);
            root = node;
        } else {
            add(value,root);
        }
    }
    private void add(T value, Node ref) {
    }

    private class Node {
        T data;
        Node left;
        Node right;
        Node(T data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
        Node(T data) {
            this(data, null, null);
        }
        Node() {
            this(null);
        }
    }
}
