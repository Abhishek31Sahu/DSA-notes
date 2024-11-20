import java.util.*;
public class builtin{
    public static void reverseArray(List<Integer> array){
        Collections.reverse(array);
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,4,2,5,3,3,4,7,7,2,9,1));
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
System.out.println();
        
        reverseArray(arr);
        System.out.println("reverse array");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }

    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxmum =nums[0];
        // int[] nums={-2,1,-3,4,-1,2,1,-5,4}
        for(int i=0; i<nums.length;i++){
            sum = sum+nums[i];

            maxmum =Math.max(maxmum,sum);

            if(sum<0){
                sum=0;
            }

        }
        return maxmum;
    }
}
