/*This program returns nth odd element of a list. If the index of the element exceeds 
the list size, then it retuns -1.*/

import java.util.ArrayList;
import java.util.List;

public class NthElement {
    
    Integer element=0;
    
    public Integer getElement(List<Integer> list, Integer n){
        for(Integer x: list){
            if(x%2==0 && list.indexOf(x)==n){
                element=x;
            }else if (n > list.size()){
                return -1;
            }
        }
        return element;
    }
    
    public static void main(String[]args){
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(7);
        list1.add(14);
        list1.add(87);
        list1.add(34);
        list1.add(3);
        list1.add(12);
    
        System.out.println(new NthElement().getElement(list1, 22));
    }
}
