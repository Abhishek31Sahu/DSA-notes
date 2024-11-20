public class twoPointerPromblem {
    static void sortBinary(int [] arr){
        int j=arr.length-1;
        int i=0;
        while(i<j){
            int left=arr[i] ;
            int right=arr[j];
            
            if(left==1 && right==0){
                arr[j]=1;
                arr[i]=0;
                
            }
            if(left==0){
                i++;
            }
            if(right==1){
                j++;
            }

        }
        return;
    }
    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int [] arr = {0,1,1,0,1,0,0,1,1};
        sortBinary(arr);
        printArray(arr);
    }
}
