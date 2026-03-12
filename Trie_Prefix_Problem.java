public class Trie_Prefix_Problem {
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
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';
            if(curr.chidern[idx] == null){
                curr.chidern[idx] = new Node();
            } else {
                curr.chidern[idx].freq++;
            }

            curr = curr.chidern[idx];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node root, String ans){   //TC = O(L) longest word
        if(root == null){
            return;
        }

        if(root.freq == 1){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<root.chidern.length; i++){
            if(root.chidern[i] != null){
                findPrefix(root.chidern[i], ans+(char)(i+'a'));
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};

        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }

        root.freq = -1;
        findPrefix(root, "");
    }
}
