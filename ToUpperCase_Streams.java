/*A method that coverts all Strings in a List to upper case*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase_Streams {
    public static List<String> upperCase (List<String>list){
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
     
    public static void main(String[] args){
        List<String> myList= new ArrayList<>( Arrays.asList(
            "summer", "autumn","winter","spring"
        ));
        System.out.println(upperCase(myList));
        }
        
    }


