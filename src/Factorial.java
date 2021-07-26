
public class Factorial {
    Integer fact=1;
    
    public Integer factorial(Integer n){
        for(int x=1; x<=n; x++){
                fact*=x;
            }
        return fact;
    }

    
    
    
    public static void main(String[] args){
        System.out.println(new Factorial().factorial(4));
    
    }
}
