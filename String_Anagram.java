import java.util.Arrays;

public class String_Anagram {
    public static boolean Anagram(String str1, String str2){
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        String s1 = "VRAJPALADIYA";
        String s2 = "Vraj Paladiya";

        if(Anagram(s1, s2)){
            System.out.println("String are Anagram");
        }
        else{
            System.out.println("String are not Anagram");
        }
    }
}
