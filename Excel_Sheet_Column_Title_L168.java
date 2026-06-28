public class Excel_Sheet_Column_Title_L168 {
    public static String convertToTitle(int columnNumber){
        StringBuilder result = new StringBuilder();

        while(columnNumber > 0){
            columnNumber--;
            result.append((char) ('A' + (columnNumber % 26)));
            columnNumber /= 26;
        }

        return result.reverse().toString();
    }
    public static void main(String[] args){

        int num = 703;
        System.out.println("Final ans : " + convertToTitle(num));
    }
}