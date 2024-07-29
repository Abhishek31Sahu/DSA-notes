
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
            boolean flag = false;
            for(int j = 0; j<size-i-1;j++){
                if(str[j]>str[j+1]){
                    int temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                    flag = true;
                }
            }
            if(flag=false){
                return;
            
            }
        }
        for(int val : str){
            System.out.print(val +" ");
        }
    }
    
}


