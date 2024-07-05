
import java.util.Scanner;

public class matrixarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();
        

        int[][] matrix = new int[row][col];
        for(int i=0;i<row;i++){
            for(int m=0;m<col;m++){
                matrix[i][m] = sc.nextInt();
                
            }
        }
        
        
        for(int i=0;i<row;i++){
            for (int m = 0; m < col; m++) {
                System.out.print(matrix[i][m]+" ");

                
            }
            System.out.println();
        }
        
        

    }

}
    

