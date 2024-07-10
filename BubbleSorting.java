
import java.util.Scanner;

public class BubbleSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int str[] = new int[size];
        for (int i = 0; i < size; i++) {
            str[i]=sc.nextInt();
            
        }
// bubble short
        for (int i = 0; i < size-1; i++) {
            for(int j=size;j>=1;j--){
                if(str[i]>str[i+1]){
                    int current = str[i+1];
                    str[i+1] = str[i];
                    str[i]=current;
                }
            }
            
        }
        for (int i = 0; i < size; i++) {
            System.out.print(str[i]+" ");
            
        }
        
    }
    
}
