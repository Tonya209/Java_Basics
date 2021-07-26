/*This program returns the largest number in the list.*/

public class Maximum {
   Integer result=0;
    
    public Integer maximum (Integer[]list){
        for(int x =0; x< list.length-1; x++){
            if(list[x]-list[x+1]>0){
                System.out.println("The biggest number is: " + list[x]);
                result= list[x];
            }
        }
        return result;
    }
    
    public static void main(String[] args){
        Integer[] array= {2, 12, 45, 66, 71, 1, 4, 56};
        new Maximum().maximum(array);
    
    }
}
