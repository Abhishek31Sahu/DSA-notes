
// Java code to implement the approach

public class runningmedian {

	// Function to find position to insert current element
	// of stream using binary search
	static int binarySearch(float arr[], float item,
							int low, int high)
	{
		if (low >= high) {
			return (item > arr[low]) ? (low + 1) : low;
		}

		int mid = (low + high) / 2;
        System.out.println("mid "+mid);

		if (item == arr[mid])
			return mid + 1;

		if (item > arr[mid])
			return binarySearch(arr, item, mid + 1, high);

		return binarySearch(arr, item, low, mid - 1);
	}

	// Function to print median of stream of integers
	static void printMedian(float arr[], int n)
	{
		int i, j, pos;
		float num;
		int count = 1;

		System.out.println("Median after reading 1"
						+ " element is " + arr[0]);

		for (i = 1; i < n; i++) {
            System.out.println("i "+i);
			float median;
			j = i - 1;
			num = arr[i];
            System.out.println("num "+num);

			// find position to insert current element in
			// sorted part of array
			pos = binarySearch(arr, num, 0, j);
            System.out.println("binary"+pos);
			// move elements to right to create space to
			// insert the current element
            System.out.println("j "+j);
			while (j >= pos) {
                
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = num;
            System.out.println("num "+num);
            
			// increment count of sorted elements in array
			count++;
            System.out.println("count"+count);

			// if odd number of integers are read from
			// stream then middle element in sorted order is
			// median else average of middle elements is
			// median
			if (count % 2 != 0) {
				median = arr[count / 2];
			}
			else {
				median = (arr[(count / 2) - 1]
						+ arr[count / 2])
						/ 2;
			}

			System.out.println("Median after reading "
							+ (i + 1) + " elements is "
							+ median);
		}
	}

	// Driver code
	public static void main(String[] args)
	{

		float arr[]
			= { 5, 15, 1, 3, 2 };
		int n = arr.length;

		printMedian(arr, n);
	}
}

// This code is contributed by sanjoy_62.

// This code is modified by Susobhan Akhuli

