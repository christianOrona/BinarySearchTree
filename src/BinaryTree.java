/**
 * Created by Sarge on 8/4/2017.
 */
public class BinaryTree {

    private Node root=new Node(6);

    public BinaryTree(){

    }

    public void addValue(int value){
             this.root.addNode(root,value);
    }

    public void traverse(){
     this.root.visitNode(root);

    }


}
