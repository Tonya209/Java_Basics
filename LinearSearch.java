
import java.util.Arrays;

/*A method that returns the index of the first occurence of a given integer
in a list. If the number doesn´t exist, return -1.*/
public class LinearSearch {
    Integer result=0;
    public int search(Integer n, Integer[] list){
        for(Integer x: list){
            if(x.equals(n)){
                result= Arrays.asList(list).indexOf(n);
                System.out.println("Index of number " + n +" is: "+result );
            
            }
        }
        return result;
    }
    
    public static void main(String[] args){
        Integer[] array = {4, 3, 8, 9, 1, 2};
        new LinearSearch().search(3,array );
    
    }
}
