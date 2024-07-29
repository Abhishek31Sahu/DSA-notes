

public class insertingSorting {
    public static void main(String[] args) {
    
        int [] arr ={6,4,8,3,68};
        
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    
        for(int abhi : arr){
            System.out.print(abhi+ " ");
        }
    }
}

