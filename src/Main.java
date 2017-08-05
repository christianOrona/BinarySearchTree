import com.sun.org.apache.xpath.internal.functions.FuncFloor;

/**
 * Created by Sarge on 8/4/2017.
 */
public class Main {


    public static void main(String args[]){
    BinaryTree tree = new BinaryTree();
        int random=0;
        for( int i =0;  i<1000; i++){
         random =  randomWithRange(1,10000) ;
         tree.addValue(random);
         System.out.println("Random Numbers: "+random);
        }
        /*tree.addValue(25);
        tree.addValue(4);
        tree.addValue(26);*/

        System.out.println("-----PRINTING IN ORDER--------------------------------------------");
    tree.traverse();

    }

public static  int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
