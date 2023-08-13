/*Here there are three ways to iterate through an ArrayList*/

import java.util.ArrayList;
import java.util.Iterator;
public class IterateArrayList {
    public static void main(String[] args){
        ArrayList<String> animals= new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("fish");
        animals.add("cow");
        animals.add("sheep");
        animals.add("horse");
        
        //iterate using for-loop
        System.out.println("----Iterate with for-loop------");
        for(int x=0; x<animals.size(); x++){
            System.out.println(animals.get(x));
        }
    
        //iterate with advanced loop
        System.out.println("----Iterate with advanced loop------");
        for(String s:animals){
            System.out.println(s);
        }
        
        //iterate with iterator
        System.out.println("-----Iterate with Iterator------");
        Iterator iter = animals.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
    }       
}
