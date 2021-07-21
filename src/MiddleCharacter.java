import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la palabra: ");
        String palabra = sc.nextLine();
        
        if(palabra.length()%2==0){ //mama, potato
            int index= palabra.length()/2;
            System.out.println(palabra.substring(index-1, index+1));
        }else{
           int index= palabra.length()/2;
            System.out.println(palabra.substring(index, index+1));
            
            //table
        }
    
    }
}
