public class String_Compression {

    public static String Compression(String str){
        String NewStr = "";

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
             while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
             }
             NewStr += str.charAt(i);
             if(count > 1){
                NewStr += count.toString();
             }
        }
        return NewStr;
    }
    public static void main(String[] args) {
        String str = "aaabbccdddd";

        System.out.println(Compression(str));
    }
}
