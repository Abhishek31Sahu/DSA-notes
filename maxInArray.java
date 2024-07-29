
import java.util.Scanner;

public class maxInArray{
    public static int printMax(int[] array , int index ){
        if(index==array.length-1){
            
    
            return max ;
        }
        int abhi = printMax(array, index+1);
        
        Math.max(array[index], abhi);
        return abhi;


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
            
        }
        // int[] array={2,3,7,9};
        
        System.out.println(printMax(array, 0));



    }
    
}
    