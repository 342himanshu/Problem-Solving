package remove_duplicates;

import java.util.Scanner;

class RemoveDuplicates{
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
    public static int removeDuplicates(int []nums){
        int n = nums.length;
        int i=0,j=1,count=1;
        while(j<n){
            if(nums[i] == nums[j])
            j++;
            else{
                i++;
                nums[i] = nums[j];
                j++;
                count++;
            }
        }
        return count;
    }
}