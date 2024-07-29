public class selectionSorting {
    public static void main(String[] args) {
        int [] arr ={5,3,7,0,2,9};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for(int j = i+1 ;j <n;j++){
                if(arr[j]<arr[min_index]){
                    
                    min_index = j;
                }
                
            }
            if(min_index!=i){
                int temp = arr[i];
                arr[i]= arr[min_index];
                arr[min_index]=temp;
            }
            
        }
        for(int abhi : arr){      
            System.out.print(abhi + " ");
        }
        
    }
}

