
public class StringConvert {
  
        
        
        String s ="I work for Edicom and I like it.";
        public String extractString(String str, int index1, int index2){
        
            int b= index1;
            int a= index2;
            
           String newString="";
            
            for(int i=a; i<=b; i++){
                newString+= String.valueOf(str.charAt(i));
            }
            
            StringBuilder str2 = new StringBuilder();
            str2.append(newString);
            str2.reverse();
            String y=str2.toString();
            
        return y;
        }
        
    public static void main(String[] args){
        StringConvert sc= new StringConvert();
        System.out.println(sc.extractString(sc.s, 17, 11)); 
    }
    }

