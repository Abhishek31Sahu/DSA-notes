
import java.util.Scanner;

public class insertingSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int number[] = new int [size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
            
        }
        
        for (int i = 1; i < size; i++) {
            int current = number[i];
            int j=i-1;
                while(j>=0&&current<number[j]){
                number[j+1]=number[j];
                j--;
                }

            number[j+1] = current;
                
                

        }
            
        
        for (int i = 0; i < size; i++) {
            System.out.print(number[i]+" ");
            
        }
    }
}
