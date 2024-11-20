

public class RadixShort {
    public static void countShort(int [] array , int place){
        int n = array.length;
        int [] freq = new int[10];
        for (int i = 0; i<n ; i++) {
            freq[(array[i]/place)%10]++;
        }
        for (int i = 1; i < 10; i++) {
            freq[i]+=freq[i-1];
        }
        int [] count = new int[n];
        for(int i=n-1;i>=0;i--){
            int index = (array[i]/place)%10;
            int position = freq[index];
            count[position-1]=array[i];
            freq[index]--;
        }
        for (int i = 0; i < n; i++) {
            array[i] = count[i];
        }

    }
    public static void main(String[] args) {
        int [] arr = {304,564,87,113};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int place =1; max/place>0; place*=10 ){
            countShort(arr, place);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }   
}
