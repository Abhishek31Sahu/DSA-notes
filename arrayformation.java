
import java.util.*;

public class arrayformation {
    public static void main(String[] args) {
        System.out.println("first method for array formation");
 // first method for array formation
        int[] arr = new int[3];
        arr[0]=10;
        arr[1]= 70;
        arr[2]=20;
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("second method for array formation");
 // second method for array formation
        int[] secondarr ={10,70,20};
        for(int i=0;i<3;i++){
            System.out.print(secondarr[i]+" ");
        }
        System.out.println();
 // Taking an array as an input and printing its elements.
        Scanner sc=new Scanner(System.in);
        System.out.println("input the size of array");
        int size = sc.nextInt();
        int number[] = new int[size];
        
        for(int i=0;i<size;i++){
            System.out.println("input the data of array of index "+i);
            number[i]=sc.nextInt();
        }
        System.out.println("total data entry");
        for(int i=0;i<3;i++){
            System.out.print(number[i]+" ");
        }



    }
    
}
