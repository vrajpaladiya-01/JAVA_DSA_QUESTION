public class fun_inverted_half_pyramid {
    public static void in_half_pyramid(int row, int column){

        for(int i=1; i<=row; i++){
            for(int j=1; j<=column-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        in_half_pyramid(5, 5);
    }
}
