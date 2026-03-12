public class Trie_count_unique_subString {
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

    public static int countNode(Node root){
            if( root == null){
                return 0;
            }

            int count = 0;
            for(int i=0; i<26; i++){
                if(root.chidern[i] != null){
                    count += countNode(root.chidern[i]);
                }
            }

            return count+1;
    }
    public static void main(String[] args) {
        String str = "apple";

        // suffix -> insert in trie
        for(int i=0; i<str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(countNode(root));
    }
}
