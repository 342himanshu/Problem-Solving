package climbing_stair;

import java.util.Scanner;

class ClimbingStair{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        
        // //method 1 using recursion

        // int [] ans = new int[n+1];
        // return climb(n,ans);

        // //method 2 using loop

        // if(n == 1 || n == 2) return n;
        // int []ans = new int[n+1];
        // ans[1] = 1;
        // ans[2] = 2;
        // for(int i=3;i<=n;i++){
        //     ans[i] = ans[i-1]+ans[i-2];
        // }
        // return ans[n];

        //method 3 using constant memory
        if(n == 1 || n == 2) return n;
        int prev = 1;
        int curr = 2;
        for(int i=3;i<=n;i++){
            int ans = prev+curr;
            prev = curr;
            curr = ans;
        }
        return curr;
    } 

    public static int climb(int n,int []ans){
        if(n == 1 || n == 2) return n;
        if(ans[n] != 0) return ans[n];
        ans[n] = climb(n-1,ans)+climb(n-2,ans);
        return ans[n];
    }
}
