public class Length_Of_Last_Word {

    public static int lastWord(String s){
        int length = 0;
        int i = s.length()-1;

        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }

        while(i >= 0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;
    }
    public static void main(String[] args) {
        String name = "Hello i am vraj paladiya from surat";

        System.out.println(lastWord(name));
    }
}
