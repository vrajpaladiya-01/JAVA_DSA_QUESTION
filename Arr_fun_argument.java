public class Arr_fun_argument {
    public static void arg(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 2;
        }
    }
    public static void main(String[] args) {
        int marks[] = {95, 96,97};
        arg(marks);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}