


public class Recurision{
    public static int printMax(int[] array , int index ){
        if(index==array.length-1){
            return array[index];
        }
        int abhi = printMax(array, index+1);
        
        Math.max(array[index], abhi);
        return abhi;


    }
    public static void main(String args[]){
        int[] array={2,3,7,9};
        // int len = array.length;
        System.out.println(printMax(array, 0));



    }
    
}