/*This program is based on a children game. We loop through numbers 0 to 100. All numbers
divisble by 3 are replaced by a word "Fizz" and all numbers divisible by 5 are replaced with a
word "Buzz". We are using a basic for loop and % operator, which checks if the numbers is divided 
without a rest.*/
public class FizzBuzz {
    public static void main(String[] args){
        
        for(int x =0; x<=100; x++){
            if(x%3==0){
                System.out.println("Fizz");
            }else if(x%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(x);
            }
    }
}
}