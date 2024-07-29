import java.util.Scanner;
public class prefixSumProblem{
    static void arrayForm(int [] arr){
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static void printArray(int [] arr,int start,int size){
        System.out.println("Array");
        for (int i = start; i < size; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
        
    }
    static void prefsum(int [] arr){
        int [] prefix = new int [arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        printArray(prefix,0,arr.length);
        System.out.println("Sum of no. of range : "+rangesum(prefix));
        subarray(prefix, arr);
        


    }
    static int rangesum(int[] prefix){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range" );
        int l =sc.nextInt();
        int r = sc.nextInt();
        int size = prefix.length+1;
        int[] arrayForm = new int[size];
        int j = 0;
        // arrayForm[0]=0;
        for (int i = 1; i<= prefix.length; i++) {
            arrayForm[i] = prefix[j];
            j++;
            
        }
        
        int sum = arrayForm[r]-arrayForm[l-1]; 
        return sum;
    }
    public static void subarray(int[] prefix,int[] arr){
        int n =prefix.length;
        for ( int i = 0; i < prefix.length; i++) {
            int suffixsum = prefix[n-1]-prefix[i];
            if(suffixsum == prefix[i]){
                System.out.println("sum of subarray: "+suffixsum);
                System.out.println("subarray according to equal sum");
                System.out.println("First");
                printArray(arr,0, i+1);
                System.out.println("second");
                printArray(arr, i+1, n);
                return;
                
            }
        }
        System.out.println("there are subarray not found");

        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size =sc.nextInt();
        int [] arr = new int[size];
        

        arrayForm(arr);
        printArray(arr,0,arr.length);
        prefsum(arr);
        


    }
}