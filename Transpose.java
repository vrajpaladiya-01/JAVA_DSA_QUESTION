public class Transpose {
    public static void main(String[] args) {
        int num[][] = { {1, 2, 3},
                        {4, 5, 6}};

        int rows = num.length;
        int cols = num[0].length;

        int[][] transpose = new int[cols][rows];

        //Swap i and j
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                transpose[j][i] = num[i][j];
            }
        }

        //Print Transpise
        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
