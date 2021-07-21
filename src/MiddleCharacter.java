/*In this program we need to get the middle character of a given String.
If the number of letters is even, we will show 2 middle characters. 
For example, if a word is "TABLE" we will show "B", and if the word is "RICE", 
we will show "IC".*/

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la palabra: ");
        String palabra = sc.nextLine();
        
        if(palabra.length()%2==0){ 
            int index= palabra.length()/2;
            System.out.println(palabra.substring(index-1, index+1));
        }else{
           int index= palabra.length()/2;
            System.out.println(palabra.substring(index, index+1));
            
            
        }
    
    }
}
