import java.util.*;

public class Spiral_Matrix_L54 {
    public static List<Integer> SpiralOrder(int[][] matrix){
        List<Integer> ans = new ArrayList<>();

        int StartRow = 0;
        int EndRow = matrix.length-1;
        int StartCol = 0;
        int EndCol = matrix[0].length-1;

        while(StartRow <= EndRow && StartCol <= EndCol){
            for(int i=StartCol; i<=EndCol; i++){
                ans.add(matrix[StartRow][i]);
            }
            StartRow++;

            for(int j=StartRow; j<=EndRow; j++){
                ans.add(matrix[j][EndCol]);
            }
            EndCol--;

            if(StartRow <= EndRow){
                for(int i=EndCol; i>=StartCol; i--){
                    ans.add(matrix[EndRow][i]);
                }
                EndRow--;
            }

            if(StartCol <= EndCol){
                for(int j=EndRow; j>=StartRow; j--){
                    ans.add(matrix[j][StartCol]);
                }
                StartCol++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        System.out.println(SpiralOrder(matrix));
    }
}