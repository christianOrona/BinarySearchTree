/**
 * Created by Sarge on 8/4/2017.
 */
public class Main {


    public static void main(String args[]){
    BinaryTree tree = new BinaryTree();
        int random=0;
        //Adding nodes to non recursive function
/*        for( int i =0;  i<100; i++){
         random =  randomWithRange(1,10000) ;
         tree.addValueNonRecursively(random);
         System.out.println("Random Numbers: "+random);
        }*/
        //Adding nodes to recursive function
        for( int i =0;  i<100; i++){
            random =  randomWithRange(1,1000) ;
            tree.addValueRecursively(random);
            System.out.println("Random Numbers: "+random);
        }
        System.out.println("-----PRINTING IN ORDER--------------------------------------------");
        tree.traverse();
        System.out.println("-----SEARCH RESULT--------------------------------------------");
    if (tree.searchValue(927)){
        System.out.println("Found it!");
    }else{
        System.out.println("Not Found it!");
    }

    }

public static  int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
