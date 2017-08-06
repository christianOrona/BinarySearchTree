/**
 * Created by Sarge on 8/4/2017.
 */
public class BinaryTree {

    private Node root=new Node(6);

    public BinaryTree(){

    }

    public void addValueNonRecursively(int value){
             this.root.addNodeWithoutRecursion(root,value);
    }
    public void addValueRecursively(int key) {
        this.root.addNodeWithRecursion(root, new Node(key));
    }

    public void traverse(){
     this.root.visitNode(root);

    }


}
