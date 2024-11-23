

public class insertingSorting {
    public static void main(String[] args) {
    
        int [] arr ={6,4,8,3,68};
        
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
                
        }
    
        for(int abhi : arr){
            System.out.print(abhi+ " ");
        }
    }
}

