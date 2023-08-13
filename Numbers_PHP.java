
public class Numbers_PHP {
    
    
  int a =3;
  int b =4;
   
   int duplicate(int x){
       System.out.println("Before executing the function the value is: " + x);
       
       return x*2;
       
   }
   
  public static void main(String[] args){
   Numbers_PHP n = new Numbers_PHP();
  n.duplicate(n.a);
  System.out.println(n.a);
  }
}
