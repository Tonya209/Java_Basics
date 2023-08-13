/*Fibonacci sequence is created this way: the numbers next to each other are added up and the result becomes the next 
number in the sequence.*/

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[]args){
        int x=0, y=1, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce how many numbers you want to see: ");
        
        
        int number = sc.nextInt();
        
       System.out.println("-------------numbers: ---------");
        for(int i=0; i<number; i++){
            
          System.out.println(x+" ");
           sum=x+y;
            x=y;
            y=sum;
            
       }
        
    
    }
}
