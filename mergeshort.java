public class mergeshort {
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void merge(int [] array , int l, int mid, int r){
        int[] right = new int[mid-l+1];
        int[] left = new int[r-mid];
        for (int i = 0; i < left.length; i++) {
            left[i]=array[l+i];
        }
        for(int i=0;i<right.length;i++){
            right[i]= array[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                array[k++]=left[i++];
            }else{
                array[k++]=right[j++];
            }
            
        }
        while(i<left.length){
            array[k++]=left[i++];
        }
        while(j<right.length){
            array[k++]=right[j++];
        }

    }
    public static void mergeShort(int [] array , int l,int r){
        if(l>=r)return;
        int mid = (l+r)/2;

        mergeShort(array, l, mid);
        mergeShort(array, mid+1, r);
        
        merge(array, l, mid, r);
// for easy to understand the recursion
        // System.out.println(l );
        // System.out.println(mid);
        // System.out.println(r);
    }
    public static void main(String[] args) {
        int [] array = {5,3,4,2};
        int n = array.length;
        System.out.println("Before ");
        printArray(array);
        mergeShort(array,0,n-1);
        System.out.println("After");
        printArray(array);
    }
}
