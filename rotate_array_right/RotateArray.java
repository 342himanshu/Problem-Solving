package rotate_array_right;

import java.util.Scanner;

class RotateArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        } 
        int k = sc.nextInt();
        k %= n;
        reverse(0, n-k-1, nums);
        reverse(n-k, n-1, nums);
        reverse(0, n-1, nums);
        
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void reverse(int start, int end, int[] nums){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            // nums[end] = nums[start]-nums[end];
            // nums[start] = nums[start] - nums[end];
            // nums[end] = nums[start] + nums[end];
            start++;
            end--;
        }
    }
}