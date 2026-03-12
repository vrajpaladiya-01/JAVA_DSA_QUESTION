public class Trie_longestWord_Prefix {
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

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }

        for(int i=0; i<26; i++){
            if(root.chidern[i] != null && root.chidern[i].eow == true){
                char ch = (char)(i + 'a');
                temp.append(ch);

                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.chidern[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
