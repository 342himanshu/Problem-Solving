package remove_element;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++)
        nums[i] = sc.nextInt();
        int val = sc.nextInt();

        int count = removeElement(nums, val);
        for(int i=0;i<count;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static int removeElement(int [] nums, int val){
        int n = nums.length;
        int count = 0,j=n-1;
        for(int i=0;i<n;i++){
            if(nums[i] == val){
                count++;
                while(j>i){
                    if(nums[j] == val)
                    j--;
                    else{
                        nums[i] = nums[j];
                        j--;
                        break;
                    }
                }
            }
        }
        return n-count;
    }
    
}
