// not able to solve that problem in this editor;
import java.util.ArrayList;
import java.util.List;

public class BucketShort {
    static void countShort(float[] arr){
        int n=arr.length;
        // Create buckets
        ArrayList<Float> buckets = new ArrayList<>(n);
        // add buckets
        for (int i = 0; i < n; i++){
            
        }
        // Add a elements  in buckets
        for (int i = 0; i < n; i++) {
            int index = (int) arr[i]*10;
            buckets[index] = arr[i];
        }
        // 
    }
    public static void main(String[] args) {
        float [] arr = {0.2f,0.3f,0.1f,0.7f,0.4f};
        countShort(arr);
    }
}
