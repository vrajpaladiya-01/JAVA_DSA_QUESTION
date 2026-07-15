public class Bit_Up_Low_Character {
    public static void main(String[] args) {
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print((char) (ch | ' '));
        }
    }
}
