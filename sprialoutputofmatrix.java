
import java.util.*;

// Print the spiral order matrix as output for a given matrix of numbers. 

public class sprialoutputofmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];

        for(int i=0;i<r;i++){
            for(int m=0;m<c;m++){
                matrix[r][m] = sc.nextInt();
            }
        }

        int rowstart=0;
        int rowend=r-1;
        int colstart=0;
        int colend=c-1;

        while(rowstart<=rowend&&colstart<=colend){
            for(int i=0;i<=colend;i++){
                System.out.print(matrix[rowstart][i]+" ");
            }
            rowstart++;
            for(int i=0;i<=rowend;i++){
                System.out.print(matrix[i][colend]+" ");
            }
            colend--;
            for(int i=colend;i<=colstart;i--){
                System.out.print(matrix[rowend][i]+" ");
            }
            rowend--;
            for(int i=rowend;i<=rowstart;i--){
                System.out.print(matrix[i][colstart]+" ");
            }
            colstart++;
            System.out.println();
        }
    }
    
}
