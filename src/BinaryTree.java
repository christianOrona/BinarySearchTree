/**
 * Created by Sarge on 8/4/2017.
 */
public class BinaryTree {

    private Node root=new Node();

    public BinaryTree(){

    }
    public BinaryTree(int root){
    this.root = new Node(root);
    }
    public void addValueNonRecursively(int value){
             this.root.addNodeWithoutRecursion(root,value);
    }
    public void addValueRecursively(int value) {
        this.root.addNodeWithRecursion(root, value);
    }

    public void traverse(){
     this.root.visitNode(root);

    }
    public boolean searchValue(int value){
       return this.root.search(value);

    }


}
