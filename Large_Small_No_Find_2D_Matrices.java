import java.util.*;

public class Large_Small_No_Find_2D_Matrices {

    public static int largest(int matrix[][]){

        int large = Integer.MIN_VALUE;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(large < matrix[i][j]){
                    large = matrix[i][j];
                    // System.out.println("Large value : " + large);
                }
            }
        }
        return large;
    }

    public static int smallest(int matrix[][]){

        int small = Integer.MAX_VALUE;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(small > matrix[i][j]){
                    small = matrix[i][j];
                    // System.out.println("small value : " + small);
                }
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m =matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // System.out.println(largest(matrix));
        // System.out.println(smallest(matrix));
    }
}