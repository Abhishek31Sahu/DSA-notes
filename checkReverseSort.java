
import java.util.Scanner;

public class checkReverseSort {
    static void checkReverseArraySorted(int [] arr,int n ){
        int count=0;
        int times=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }else if(count>0) {
                if(times==0){
                if(arr[i-count]<arr[i+1]){
                    count=0;
                    times++;
                }
                else{
                    System.out.println("NO");
                    return;
                }
                }
                else{
                    System.out.println("NO");
                    return;
                }

            }
        }
        if(count>0){
            System.out.println("NO");
            return;
        }

        System.out.println("Yes");

    }
    public static void main(String [] args){
        int a=1;
        while(a>0){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("enter the value of arr");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        checkReverseArraySorted(arr,size);
        System.out.println("for exit give smaller than 0");
        a=sc.nextInt();

    }
    }
}
