public class Trie_startWith_Problem {
    static class Node {
        Node[] chidern = new Node[26];
        boolean eow = false;
        int freq;

        public Node(){
            for(int i=0; i<chidern.length; i++){
                chidern[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        int level = 0;
        int len = word.length();
        int idx = 0;

        Node curr = root;
        for(; level<len; level++){
            idx = word.charAt(level) - 'a';

            if(curr.chidern[idx] == null){
                curr.chidern[idx] = new Node();
            }
            curr = curr.chidern[idx];
        }
        curr.eow = true;
    }

    public static boolean Search(String key){
        int level = 0;
        int len = key.length();
        int idx = 0;

        Node curr = root;
        for(; level<len; level++){
            idx = key.charAt(level) - 'a';
            if(curr.chidern[idx] == null){
                return false;
            }
            curr = curr.chidern[idx];
        }
        return curr.eow == true;
    }

    public static boolean startWith(String prefix){     // O(L)
        Node curr = root;

        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i)  - 'a';
            if(curr.chidern[idx] == null){
                return false;
            }

            curr = curr.chidern[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(startWith(prefix1));
        System.out.println(startWith(prefix2));
    }
}
