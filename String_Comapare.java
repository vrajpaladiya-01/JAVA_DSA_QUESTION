public class String_Comapare {
    public static void main(String[] args) {
        String s1 = "Vraj";
        String s2 = "Vraj";
        String s3 = new String("Vraj");

        if(s1 == s2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        if(s1.equals(s3)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
