package remove_duplicates2;

import java.util.Scanner;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        } 
        int count = removeDuplicates(arr);
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0,j = 1,count = 1,freq = 0;
        while(j<n){
            if(nums[i] == nums[j]){
                if(freq == 0){
                    i++;
                    nums[i] = nums[j];
                    j++;
                    freq++;
                    count++;
                }
                else{
                    j++;
                }
            }
            else{
                i++;
                nums[i] = nums[j];
                j++;
                count++;
                freq=0;
            }
        }
        return count;
    }
    
}
