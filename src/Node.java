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

 public Node addNode(Node root,int value){
     System.out.println("root node: "+root.getValue());
        Node node = new Node(value);
        if(root==null){
            return node;
        }
        Node parentNode = null;
     System.out.println("Parent node: "+parentNode);
        Node currentNode=root;
        System.out.println("Current node: "+currentNode);
     System.out.println("To the loop...");
        while(currentNode!=null){
            parentNode=currentNode;
            System.out.println("Parent node: "+parentNode);
            if(value<currentNode.getValue()){
                System.out.println("Current "+currentNode.getValue()+" is less than "+value+", moving to the left");
                currentNode=currentNode.getLeft();

            }else{
                System.out.println("Current "+currentNode.getValue()+" is more than "+value+", moving to the right: ");
                currentNode=currentNode.getRight();

            }
        }
     System.out.println("Loop Has ended");
        if(value<parentNode.getValue()){
            System.out.println("Parent is less than "+value+", adding to the left node");
            parentNode.setLeft(node);
        }else{
            System.out.println("Parent is more than "+value+", adding to the right node");
            parentNode.setRight(node);
        }
     return root;
 }


    public void visitNode (Node root){
        if (root.left != null){
            visitNode (root.getLeft());
        }

        System.out.println(root.getValue());

        if (root.right != null){
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
