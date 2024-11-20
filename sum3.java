
import java.util.*;
    class Solution {
        public static List<List<Integer>> threeSum(int[] arr) {
            int count=0,abhi=0;
            List<List<Integer>> result = new ArrayList<>();
    
            for(int i=0;i<arr.length-2;i++){
                for(int j=i+1;j<arr.length-1;j++){
                    for(int k=j+1;k<arr.length;k++){
                        // for (List<Integer> innerList : result) {
                        //     int no=0;
                        //     if(innerList.get(0)==arr[i]||innerList.get(0)==arr[j]||innerList.get(0)==arr[k]){
                        //         no++;
                        //     }if(innerList.get(1)==arr[i]||innerList.get(1)==arr[j]||innerList.get(1)==arr[k]){
                        //         no++;
                        //     }if(innerList.get(2)==arr[i]||innerList.get(2)==arr[j]||innerList.get(2)==arr[k]){
                        //         no++;
                        //     }
                        //     if(no==3){
                        //         count--;
                                
                        //     }
                        // }
                        if(arr[i]+arr[j]+arr[k]==0){
                            count++;
                            
            // Populate the list with example data
            for (int l = abhi; l < count; l++) {
                List<Integer> innerList = new ArrayList<>();
                
                    innerList.add(arr[i]);
                    innerList.add(arr[j]);
                    innerList.add(arr[k]);
                
                result.add(innerList);
            }
            abhi++;
                        }
                    }
                }
            }
            return result;
        }
        public static void main(String[] args) {
            int[] arr={-1,0,1,2,-1,-4,-2,-3,0,3,4};
            List<List<Integer>> result = threeSum(arr);
        for (List<Integer> innerList : result) 
            System.out.println(innerList.get(0) + " " + innerList.get(1)
                                                + " " + innerList.get(2));
        }
    }

