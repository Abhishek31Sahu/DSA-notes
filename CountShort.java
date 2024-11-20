class CountShort {
    public static void displayArray(int [] arr ){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void basicCountShort(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int [] freq = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        displayArray(freq);
        int j=0;
        for (int i = 0; i < freq.length; i++) {
                while(freq[i]>0){
                    arr[j]=i;
                    j++;
                    freq[i]--;
                }    
        }
    }
    public static void main(String[] args) {
        int [] arr ={2,7,5,2,10,3,4,1,4};
        // basicCountShort(arr);
        // displayArray(arr);
        adv use = new adv();
        use.advCountShort(arr);
        displayArray(arrange);
    }
}


class adv{
    public static void displayArray(int [] arr ){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void advCountShort(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int [] freq = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        displayArray(freq);
    
        for (int i = 1; i < freq.length; i++) {
            freq[i]=freq[i-1]+freq[i];
        }
        int n=arr.length;
        int [] arrange = new int[n];
        for (int i = n-1; i >=0; i--) {
            // int index = arr[i];
            // int position = freq[index] ;
            arrange[freq[arr[i]]-1]=arr[i];
            freq[arr[i]]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i]=arrange[i];
        }
        
        displayArray(freq);
    }
    public static void main(String[] args) {
        int [] arr ={2,7,5,2,10,3,4,1,4};
        // basicCountShort(arr);
        // displayArray(arr);
        advCountShort(arr);
        displayArray(arr);
        
    }
    
    
}
