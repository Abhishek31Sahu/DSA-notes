
public class median {

    // Function to return the median of arr1 and arr2
    static double medianOf2(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;

        // Current index of input vector arr1
        int i = 0, j = 0;

        int count;

        // m1 to store the middle element
        // m2 to store the second middle element which is
        // used when total number of elements are even
        int m1 = -1, m2 = -1;

        // Loop till (m+n)/2
        for (count = 0; count <= (m + n) / 2; count++) {
            m2 = m1;
          
              // If both the arrays have remaining elements
            if (i != n && j != m) {
                m1 = (arr1[i] > arr2[j]) ? arr2[j++] : arr1[i++];
                System.out.println("if"+m1);
            }
              // If only arr1 has remaining elements
            else if (i < n) {
                m1 = arr1[i++];
                System.out.println("else if"+m1);
            }
              // If only arr2 has remaining elements
             else {
                m1 = arr2[j++];
                System.out.println("if"+m1);
             }
        }

        // Return median based on odd/even size
        if ((m + n) % 2 == 1) 
            return m1;
        else
            return (m1 + m2) / 2.0;
    }

    public static void main(String[] args) {
        int[] arr1 = { -5, 3, 6, 12, 15 };
        int[] arr2 = { -12, -10, -6, -3, 4, 10 };

        System.out.println(medianOf2(arr1, arr2));
    }

}