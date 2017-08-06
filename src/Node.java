/**
 * Created by Sarge on 8/4/2017.
 */
public class Node {

    private Node left = null;
    private Node right = null;
    private int value;

    Node (int value) {
        this.value = value;
        right = null;
        left = null;
    }
//non recursive
 public Node addNodeWithoutRecursion(Node root,int value){
          Node node = new Node(value);
        if(root==null){
            return node;
        }
        Node parentNode = null;
         Node currentNode=root;
         //Finding last place
        while(currentNode!=null){
            parentNode=currentNode;
            if(value<currentNode.getValue()){
               currentNode=currentNode.getLeft();
            }else{
                currentNode=currentNode.getRight();
            }
        }
        if(value<parentNode.getValue()){
            parentNode.setLeft(node);
        }else{
            parentNode.setRight(node);
        }
     return root;
 }
// private recursive call
    public Node addNodeWithRecursion(Node root, Node newNode) {

        if (root == null) {
            return newNode;
        } else if (newNode.getValue() > root.getValue()) {
            root.setRight(addNodeWithRecursion(root.getRight(), newNode));
        } else if (newNode.getValue() < root.getValue()) {
            root.setLeft(addNodeWithRecursion(root.getLeft(), newNode));
        }

        return root;
    }

    public void visitNode (Node root){
        if (root.getLeft() != null){
            visitNode (root.getLeft());
        }

        System.out.println(root.getValue());

        if (root.getRight() != null){
            visitNode (root.getRight());
        }
    }

    public Node searchValue(int value){

        //to do here
        //I will update you soon
        return null;
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
