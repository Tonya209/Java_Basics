/*Given number n, we need to write a method that sums all multiples of 3 and 5
up to n (inclusive). n=10 */
public class AddNumbers {
    Integer res=0;
      

        public Integer sum(Integer n){
            System.out.println("Numbers:");
            for(int x =0; x<=n; x++){
                if(x%3==0||x%5==0){
                System.out.println(x);
                
                res+=x;
                }
            }  
            System.out.println("Total result:");
            return res;
        }
        
    public static void main(String[] args){
        System.out.println(new AddNumbers().sum(10));
    }
        }
