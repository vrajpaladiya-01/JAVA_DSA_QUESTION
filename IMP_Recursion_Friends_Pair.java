public class IMP_Recursion_Friends_Pair {
    public static int FriendsPair(int n){
        //Base
        if(n == 1 || n == 2){
            return n;
        }

        //Single
        // int fnm1 = FriendsPair(n-1);

        //Pair
        // int fnm2 = FriendsPair(n-2);
        // int ways = (n-1) * fnm2;

        //Total pair

        // int TotalWay = fnm1 + ways;
        // return TotalWay;

        return FriendsPair(n-1) + (n-1) * FriendsPair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(FriendsPair(3));
    }
}
