
import java.util.Random;

class RandomizedQSort 
{	 
	// This Function helps in calculating
	// random numbers between low(inclusive)
	// and high(inclusive) 
	static void random(int arr[],int low,int high) 
	{ 
	
		Random rand= new Random(); 
		int pivot = rand.nextInt(high-low)+low; 
		
		int temp1=arr[pivot]; 
		arr[pivot]=arr[high]; 
		arr[high]=temp1; 
	} 
	
	/* This function takes last element as pivot, 
	places the pivot element at its correct 
	position in sorted array, and places all 
	smaller (smaller than pivot) to left of 
	pivot and all greater elements to right 
	of pivot */
	static int partition(int arr[], int low, int high) 
	{ 
		// pivot is chosen randomly 
		random(arr,low,high);
		int pivot = arr[high]; 
	

		int i = (low-1); // index of smaller element 
		for (int j = low; j < high; j++) 
		{ 
			// If current element is smaller than or 
			// equal to pivot 
			if (arr[j] < pivot) 
			{ 
				i++; 

				// swap arr[i] and arr[j] 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 

		// swap arr[i+1] and arr[high] (or pivot) 
		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 

		return i+1; 
	} 


	/* The main function that implements QuickSort() 
	arr[] --> Array to be sorted, 
	low --> Starting index, 
	high --> Ending index */
	static void sort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			/* pi is partitioning index, arr[pi] is 
			now at right place */
			int pi = partition(arr, low, high); 

			// Recursively sort elements before 
			// partition and after partition 
			sort(arr, low, pi-1); 
			sort(arr, pi+1, high); 
		} 
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver Code 
	public static void main(String args[]) 
	{ 
		
		int arr[] = {10, 7, 8, 9, 1, 5}; 
		int n = arr.length; 

		sort(arr, 0, n-1); 

		System.out.println("Sorted array"); 
		printArray(arr); 
	} 
} 
















// this code time complexity is more than pervious method because in this method 
// we use two pointer to arrange them in left and right with respect to pivot
class QuickSort {
    // This function takes the last element as the pivot, places the pivot element at its correct position in the sorted array,
    // and puts all smaller elements (smaller than the pivot) to the left of the pivot and all greater elements to the right.
    int partition(int arr[], int low, int high) {
        Random random =new Random();
        int randomIndex = random.nextInt(high-low)+low;
        int pivot = arr[randomIndex];
        // we are doing subtract 1 in low because in for loop randomIndex value is  added 1 in i , in if condition we used equal to sign 
        int i = low -1;
        for (int j = low; j <= high; j++) {
            if (arr[j] <= pivot) {
                i++;
				
            }
        }
        int temp = arr[i];
        arr[i] = arr[randomIndex];
        arr[randomIndex] = temp;
        while(low<i && high>i){
            if(arr[low]>arr[i]&&arr[high]<arr[i]){
                int tem = arr[low ];
                arr[low ] = arr[high];
                arr[high] = tem;
                low++;
                high--;
            }
            if(arr[low]<arr[i]){
                low++;
            }
            if(arr[high]>arr[i]){
                high--;
            }
        }
        return i;
    }
    // The main function that implements QuickSort
    void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
    // A utility function to print an array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    // Driver program
        public static void main(String args[]) {
        int arr[] = { 10,  8,4,2,3,54,1,9, 1, 5 };
        int n = arr.length;
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}





