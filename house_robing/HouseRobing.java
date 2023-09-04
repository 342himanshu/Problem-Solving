package house_robing;

import java.util.Scanner;

class HouseRobing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++)
        nums[i] = sc.nextInt();

        System.out.println(rob(nums));
    }

    public static int rob(int[] nums,int[] maxLoot,int n){
        if(n == 0) return nums[n];
        if(n == 1) return Math.max(nums[0],nums[1]);

        if(maxLoot[n] != 0) return maxLoot[n];
        maxLoot[n] = Math.max(rob(nums,maxLoot,n-1),rob(nums,maxLoot,n-2)+nums[n]);
        return maxLoot[n];
    }
    public static int rob(int[] nums) {

        //using dp in recursion
        //return rob(nums,new int[nums.length],nums.length-1);
        
        // using dp in loop
        // int n = nums.length;
        // int ans[] = new int[n];
        // ans[0] = nums[0];
        // if(n == 1) return ans[0];
        // ans[1] = Math.max(nums[0],nums[1]);
        // if(n == 2) return ans[1];
        // for(int i=2;i<n;i++){
        //     ans[i] = Math.max(ans[i-1],ans[i-2]+nums[i]);
        // }
        // return ans[n-1];

        int n = nums.length;
        int prev = nums[0];
        if(n == 1) return prev;
        int curr = Math.max(prev,nums[1]);
        if(n == 2) return curr;
        for(int i=2;i<n;i++){
            int ans = Math.max(curr, prev+nums[i]);
            prev = curr;
            curr = ans;
        }
        return curr;
    }
}