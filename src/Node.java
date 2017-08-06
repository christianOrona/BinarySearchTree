/**
 * Created by Sarge on 8/4/2017.
 */
public class Node {

    private Node left = null;
    private Node right = null;
    private int value;

    /* Constructors with params creates root with value obtained*/
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
    /* Constructors by default, creates root 0*/
    Node() {
        this.value = 0;
        right = null;
        left = null;
    }

    /* addNodeWithoutRecursion method which adds new nodes non recursively*/
    public Node addNodeWithoutRecursion(Node root, int value) {
        Node node = new Node(value);
        if (root == null) {
            return node;
        }
        Node parentNode = null;
        Node currentNode = root;
        //Finding last place
        while (currentNode != null) {
            parentNode = currentNode;
            if (value < currentNode.getValue()) {
                currentNode = currentNode.getLeft();
            } else {
                currentNode = currentNode.getRight();
            }
        }
        if (value < parentNode.getValue()) {
            parentNode.setLeft(node);
        } else {
            parentNode.setRight(node);
        }
        return root;
    }

    /* addNodeWithRecursion method which adds new nodes recursively*/
    public Node addNodeWithRecursion(Node root, int value) {
        Node newNode = new Node(value);
        if (root == null) {
            return newNode;
        } else if (newNode.getValue() > root.getValue()) {
            root.setRight(addNodeWithRecursion(root.getRight(), newNode.getValue()));
        } else if (newNode.getValue() < root.getValue()) {
            root.setLeft(addNodeWithRecursion(root.getLeft(), newNode.getValue()));
        }

        return root;
    }
    /* visit method which returns a print list of all node branches in the tree recursively*/
    public void visitNode(Node root) {
        if (root.getLeft() != null) {
            visitNode(root.getLeft());
        }
        System.out.println(root.getValue());
        if (root.getRight() != null) {
            visitNode(root.getRight());
        }
    }

    /* search method which returns a bool if result is found recursively*/
    public boolean search(int value) {
        if (value == this.getValue())
            return true;
        else if (value < this.getValue()) {
            if (this.getLeft() == null)
                return false;
            else
                return this.getLeft().search(value);
        } else if (value > this.getValue()) {
            if (this.getRight() == null)
                return false;
            else
                return this.getRight().search(value);
        }
        return false;
    }


/* Setters and Getters*/
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
