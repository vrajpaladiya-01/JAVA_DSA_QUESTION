import java.util.*;

public class DP_Climbing_Stairs {
    // Recursion Fun - O(2^n)
    public static int countWays(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        return countWays(n-1) + countWays(n-2);
    }


    //Memoization - O(n)
    public static int countWaysM(int n, int ways[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(ways[n] != -1){
            return ways[n];
        }

        ways[n] = countWaysM(n-1, ways) + countWaysM(n-2, ways);
        return ways[n];
    }


    // Tabulation - O(n)
    public static int countWayTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;

        // Tabulation loop
        for(int i=1; i<=n; i++){
            if(i == 1){
                dp[i] = dp[i-1] + 0;
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Recursion : " + countWays(n));

        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println("Recursion with Memoiazation : " + countWaysM(n, ways));

        System.out.println("Tabulation : " + countWayTab(n));
    }
}
