
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberformedfromanArray {
    static String abhi(String[] arr){
        Comparator<String> mysort =((X,Y)-> (Y+X).compareTo(X+Y));
        Arrays.sort(arr,mysort);
        StringBuilder result = new StringBuilder();
        if(arr[0].equals("0")){
            return "0";
        }
        for(String num:arr){
            result.append(num);
        }

    return result.toString();
    }
    public static void main(String[] args) {
        String [] arr={"3","67","34","1","8"};
        System.out.println(abhi(arr));
        String [] arr_={"0","0","0"};
        System.out.println(abhi(arr_));

    }


    
}
