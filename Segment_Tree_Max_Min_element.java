// "To convert max to min, replace all 'max' functions with 'min'."

public class Segment_Tree_Max_Min_element {
    static int tree[];

    public static void init(int n){
        tree = new int[4*n];
    }

    public static void buildST(int i, int si, int sj, int arr[]){   //O(n)
        if(si == sj){
            tree[i] = arr[si];
            return;
        }

        int mid = (si + sj) / 2;    // si + (sj-si)/2
        buildST(2*i+1, si, mid, arr);
        buildST(2*i+2, mid+1, sj, arr);

        tree[i] = Math.min(tree[2*i+1], tree[2*i+2]);
    }

    public static int getMin(int arr[], int qi, int qj){
        int n = arr.length;
        return getMinUtil(0, 0, n-1, qi, qj);
    }

    public static int getMinUtil(int i, int si, int sj, int qi, int qj){    //O(logn)
        if(si > qj || sj <qi){
           return Integer.MAX_VALUE;
        }
        else if(si >= qi && sj <= qj){
            return tree[i];
        }
        else{
            int mid = (si+sj) / 2;
            int leftAns = getMinUtil(2*i+1, si, mid, qi, qj);
            int rightAns = getMinUtil(2*i+2, mid+1, sj, qi, qj);

            return Math.min(leftAns, rightAns);
        }
    }

    public static void Update(int arr[], int idx, int newVal){
        arr[idx] = newVal;
        int n = arr.length;

        updateUtil(0, 0, n-1, idx, newVal);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int newVal){  //O(logn)
        if(idx < si || idx > sj){
            return;
        }

        //Minimum Value
        if(si == sj){
            tree[i] = newVal;
        }
        if(si != sj){
            tree[i] = Math.min(tree[i], newVal);
            int mid = (si+sj) / 2;
            updateUtil(2*i+1, si, mid, idx, newVal);
            updateUtil(2*i+2, mid+1, sj, idx, newVal);
        }

        // Maximum Value

        // tree[i] = Math.max(tree[i], newVal);
        // if(si != sj){
        //     int mid = (si+sj) / 2;
        //     updateUtil(2*i+1, si, mid, idx, newVal);
        //     updateUtil(2*i+2, mid+1, sj, idx, newVal);
        // }
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        init(n);

        buildST(0, 0, n-1, arr);

        // for(int i=0; i<tree.length; i++){
        //     System.out.print(tree[i] + " ");
        // }

        int max = getMin(arr, 2, 5);
        System.out.println(max);

        Update(arr, 2, 20);

        max = getMin(arr, 2, 5);
        System.out.println(max);
    }
}
