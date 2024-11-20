// 49 playlist video no.
import java.util.Scanner;

public class BinarySearch {
    static boolean binarySearch(int [] arr,int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return true;
            }
            if(arr[mid]>target){
                end = mid-1;
            }
            if(arr[mid]<target){
                start = mid+1;
            }
        }
        return false;
    }
    static boolean recBinarySearch(int [] arr,int start,int end,int target){
        if(start>end) {
            return false;//basecase
        }
        int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return true;
            }
            if(arr[mid]>target){
                
                return recBinarySearch(arr, start, mid-1, target);
            }
            if(arr[mid]<target){
                
                return recBinarySearch(arr, mid+1, end, target);
            }
            return false;
            
    }
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,7,9,10};
        int target=0;
        while(target<11){
            System.out.printf("%d is exsit : %b",target,recBinarySearch(arr,0,arr.length-1,target));
            System.out.println();
            target++;
        }
    }
}

// 1

// Find the first Occurence of given elements

class ProblemsFindFirstOccurenceOfgivenElements{
    static int binarySearch(int[] arr,int target){
        int ans=-1;
        int low= 0;
        int high= arr.length-1;
        while(low<=high){
            int mid = low + (high -low)/2;

            if(arr[mid]==target){
                ans = mid;
                high=mid-1;               
            }
            if(arr[mid]>target){
                high = mid-1;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,5,5,6,6,9,10,11};
        // int[] arr = {11,10,9,6,5,5,5,1};
        
        int target = 6;
        System.out.println("the first Occurence of given elements");
        System.out.println(binarySearch(arr,target) );
    }
}


// 2

// find the square root of given no. 
// Condition : answer in integer

class ProblemfindSquareRootOfgivenno {
    static int squareRoot(int num){
        int ans =0;
        int low=0;
        int high=num-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int value = mid*mid;
            if(value == num){
                return mid;
            }
            if(value>num){
                high=mid-1;
            }
            if(value<num){
                low=mid+1;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of no. for which you want to find the square root :");
        int num = sc.nextInt();
        // int [] arr = new int[num];
        // for (int i = 0; i < num; i++) {
        //     arr[i] = i;   
        // }
        System.out.println("the square root of given no.: ");
        System.out.println(squareRoot( num));
    }
}



// 50 playlist

class rotatedArrFindMinmumElement{
    static int minElement(int [] arr){
        int low =0;
        int high = arr.length;
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        while(low <=high){
            int mid = low +(high-low)/2;
            
            if(arr[mid]>arr[n-1]){
                low=mid+1;
            }
            if(arr[mid]<arr[n-1]){
                high=mid-1;
                ans = arr[mid];
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int [] arr ={4,5,6,7,8,1,2,3};
        System.out.println("The Minmum Element:");
        System.out.println(minElement(arr));
    }
}



// 50 playlist 

class ArrRotatedFindIndex{
    static int findIndex(int [] arr,int target){
    int low = 0;
    int n = arr.length;
    int high = n-1;
    while(low<=high){
        int mid = low + (high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if (arr[mid]<arr[high]){ //array is sorted if arr[x]<arr[y]            x<y
            if(arr[mid]<target && arr[high]>=target) low = mid +1;
            else high = mid-1;
        }
        else {
            if(arr[low]<=target && arr[mid]>target) high=mid-1;
            else low=mid+1;
        }
        
    }
    return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,11,14,1,2,3};
        Scanner sc=new Scanner(System.in);
        int target = sc.nextInt();
        // int target = 1;
        System.out.println(findIndex(arr,target));
    }
}




// 50 playlist video no

class ArrRotatedFindIndexIfDuplicateElementPresent{
    static int findIndex(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        int firstnum = arr[low];
        // while loop remove the equal start and end index value to solve the problem
        while(arr[low]==arr[high]){
            low++;
            high--;
        }
        // this is used because if no. are removed by pervious function but they do not show no. is not found ,
        //  they show their real first occurence index
        if(target==firstnum){
            return 0;
        // below function is used when arr is convert to rotated arr  
        // they say Find original arr first element index in rotated array
            // if(firstnum!=arr[high]){
            //     return high+1;
            // }
        }
        while(low<=high){
            int mid =low+(high-low)/2;
            if(arr[mid]==target) {
                ans = mid;
                high=mid-1;
            }
            else if(arr[mid]<arr[high]){
                if(arr[mid]<target && arr[high]>=target) low = mid+1;
                else high = mid-1;
            }
            else{
                if (arr[mid]>target && arr[low]<=target) high = mid-1;
                else low =mid+1;
            }
        }
        
        
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,4,5,5,5,1,1,1,1,1} ;
        Scanner sc=new Scanner(System.in);
        System.out.println("which no. you want to find");
        int target = sc.nextInt();
        System.out.println("Index of the search no.");
        System.out.println(findIndex(arr,target));
        System.out.println();
        // System.out.println();
        System.out.println("NOTE : if no. is not found answer is -1");
    }
}



// 2D Array 
// find the target 
class FindTargetInTwoDArray{
    static boolean twoDBinarySearch(int [][] arr , int m,int n,int target){
        int high = n*m-1;
        int low = 0;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid/m][mid%m]==target){
                return true;
            }
            else if (arr[mid/m][mid%m]>target){
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
    static boolean diffInArragement(int [][] arr , int i,int j,int target){
        int row =0;
        int fake = -1;
        if(arr[0][0]>target){
            return false;
        }
        while(row<=j-1 ){
            if(arr[row][i-1]==target){
                return true;
            } 
            else if(arr[row][i-1]<target){
                
                if(fake>arr[row][i-1]){
                    return false;
                }
                row++;
                
            }
            else{
                fake = arr[row][i-1];
                i--;
                

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][] array = {{-5,-3,-2},{6,7,9},{11,13,14},{15,19,20}};
        int m = array[0].length;
        int n = array.length;
        System.out.println("Enter no. to check no. exist");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("By using twoDBinarySearch method");
        System.out.println(twoDBinarySearch(array, m, n, target));
        System.out.println("By using diffInArragement method ");
        System.out.println(diffInArragement(array, m, n, target));

    // scond type of arragement of 2D array 
    // best method because this is applicable to both array
        int[][] a={{1,3,5},{2,9,11},{3, 17, 18},{4,19,20}};
        System.out.println("{{1,3,5},{2,9,11},{3, 17, 18},{4,19,20}}");
        int c = a[0].length;
        int r = a.length;
        System.out.println("Enter no. to check no. exist");
        // Scanner sc = new Scanner(System.in);
        int find   = sc.nextInt();
        System.out.println(diffInArragement(a, c, r, find));
    }
}


// peak index 


// choclate Distribution

class DistributeChoclatetoEveryStu{
    public static boolean distributeChoclate(int[] a,int m,int mid){
        int NoOfStudent = 1;
        int chocolate = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>mid)  return false;
            if(chocolate+a[i]<=mid){
                chocolate+=a[i];
            }else{
                NoOfStudent++;
                chocolate=a[i];
            }
            
        }
        return NoOfStudent<=m;
    }
    public static int abhishek(int [] a , int m){
        if(a.length<m)  return-1;
        int low = 1;
        int high = 4;
        int ans = -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            // System.out.println(mid);
            if(distributeChoclate(a,m,mid)){
                high=mid-1;
                ans = mid;
                // System.out.println(mid);
            }else{
                low = mid +1;
                // System.out.println(mid);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] ChocolateBoxes = {5,3,1,2,4};
        // Number of student = m
        int m =3;
        System.out.println(abhishek(ChocolateBoxes,m));
    }
    
}


class LargestMinDisbtweenTrack{
    public static boolean possible(int [] a,int distance , int m){
        
        int NoOfStudent = 1;
        int lastStudent = a[0];
        for (int j = 1; j < a.length; j++) {
            
            if(a[j]-lastStudent>=distance) {
                NoOfStudent++;
                lastStudent = a[j];
            } 
        }
        return NoOfStudent>=m;
    }
    public static int findLargestMinDisbtweenTrack(int [] a , int m){
        if(a.length<m) return -1;
        int low = 1;
        int high= (int)1e9;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if (possible(a,mid,m)) {
                low=mid+1;
                ans = mid;
            }else{
                high=mid-1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        // location of each spot 
        int [] TrackNo = {1,2,4,8,9};
        // m= Number of Students
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        System.out.println(findLargestMinDisbtweenTrack(TrackNo,m));
    }
}