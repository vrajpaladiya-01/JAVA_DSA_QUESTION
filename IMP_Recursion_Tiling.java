public class IMP_Recursion_Tiling {
    public static int TilingProblem(int n){ // 2 * n
        //Base case
        if(n == 1 || n == 0){
            return 1;
        }

        //Vertical
        // int fnm1 = TilingProblem(n-1);

        //Horizontal
        // int fnm2 = TilingProblem(n-2);

        // int TotalWay = fnm1 + fnm2;

        // return TotalWay;

        return TilingProblem(n-1) + TilingProblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(TilingProblem(4));
    }
}
