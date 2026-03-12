public class Backtracking_Permutations {
    public static void findPermutation(String str, String ans){
        // Base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // Recursion Work
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);

            // Sub String 
            String NewStr = str.substring(0, i) +  str.substring(i+1);
            findPermutation(NewStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, " ");
    }
}