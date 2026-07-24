import java.util.*;

public class Longest_Substring_Without_Repeating_Character {
    public static int uniqChar(String str){
        if(str.isEmpty() || str == null){
            return 0;
        }
        int count = 1;
        char[] ch = str.toCharArray();

        Arrays.sort(ch);

        for(int i=1; i<ch.length; i++){
            if(ch[i] != ch[i-1]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "pwwkew";

        System.out.println("Total uniq character in string : " + uniqChar(s));
    }
}
