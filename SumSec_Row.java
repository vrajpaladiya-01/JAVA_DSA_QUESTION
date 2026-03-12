public class SumSec_Row {

    public static void SumCol(int num[][]){
        int sum = 0;
        for(int i=0; i<num.length; i++){
            sum += num[i][2];
        }

        System.out.println("Sum of Third column : " + sum);
    }
    public static void main(String[] args) {
        int num[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};

        int sum = 0;

        for(int j=0; j<num[1].length; j++){
            sum += num[1][j];
        }

        System.out.println("Sum of second row : " + sum);
        SumCol(num);
    }
}
