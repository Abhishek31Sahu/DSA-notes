class Solution {
    // Function to find common elements in three arrays.
    public static List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        List<Integer> arr4 = new ArrayList<>();
        int n=arr1.size();
        for(int i=0;i<n;i++){
            int j=0;
            int k=0;
            while(arr1.get(i)>=arr2.get(j) && arr1.get(i)>=arr3.get(k)){
                if(arr1.get(i)==arr2.get(j) && arr1.get(i) ==arr3.get(k)){
                    arr4.add(arr1.get(i));
                }
                if(arr1.get(i)>arr2.get(j)&&arr1.get(i)>arr3.get(k)){
                    j++;
                    k++;
                }
                if(arr1.get(i)==arr2.get(j) && arr1.get(i) != arr3.get(k)){
                    k++;
                }
                if(arr1.get(i)!=arr2.get(j) && arr1.get(i)== arr3.get(k)){
                    j++;
                }
            }
        }
        return arr4;
    }
    public static void main(String[] args) {
        
    }
}
