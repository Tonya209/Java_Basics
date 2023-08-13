
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given a list of strings, this program returns a list of strings that start with the letter 'a' and have
exactly 3 letters*/
public class Filter_Streams {
    
    public List<String> search (List<String> list){
    
        return list.stream()
                .filter(x->x.startsWith("a")&& x.length()==3)
                .collect(Collectors.toList());
    }
    
    public static void main(String[] args){
        Filter_Streams fs=new Filter_Streams();
        
        List<String> myList= new ArrayList<>(Arrays.asList("car", "ant", "mouse", "apt", "alt", "avocado"));
        
       System.out.println(fs.search(myList));
    
    }
}
