
import java.util.Scanner;

public class maxrecursionmethodtwo{
    public static void printMax(int[] array , int idx , int max){
        if(idx==array.length-1){
            System.out.println(max);
            return;
        }
        if(max<array[idx]){
            max = array[idx];

        }
        printMax(array,idx+1 ,max);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
            
        }
        // int [] array = {2,4,3,9,8};
        int max = Integer.MIN_VALUE;
        printMax(array,0,max);
    }
}