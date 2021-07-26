/*Given number n, we need to write a method that sums all multiples of 3 and 5
up to n (inclusive).*/
public class AddNumbers {
    Integer res=0;
        
        public Integer sum(Integer n){
            for(int x =0; x<=n; x++){
                if(x%3==0||x%5==0){
        
                res+=x;
                }
            }  
            return res;
        }
        
    public static void main(String[] args){
        System.out.println(new AddNumbers().sum(10));
    }
        }
