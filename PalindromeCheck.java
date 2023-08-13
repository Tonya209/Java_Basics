/*This program checks whether th word is a palindrome*/
public class PalindromeCheck {
    
    
    public static boolean isPalindrome(String word){
        //divide the wor in two halves
       String firstHalf= word.substring(0, word.length()/2);
       String secondHalf= word.substring(word.length()/2);
       
       //use StringBuilder method reverse() to reverse the second half of the word
        StringBuilder sb= new StringBuilder();
        String secondHalfReverse= sb.append(secondHalf).reverse().toString();
        
        //check if two halves are equal
       if(firstHalf.equalsIgnoreCase(secondHalfReverse)){
           System.out.println("The word is a palindrome.");
           return true;
       }else{
           System.out.println("The word not a palindrome");
           return false;
       }
    }
    
    public static void main(String[] args){
        isPalindrome("");
    
    
    }
}
