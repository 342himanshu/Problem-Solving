package merge_sorted_array;
import java.util.Arrays;
import java.util.Scanner;

class MergeSortedArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int nums1[] = new int[m+n];
        int nums2[] = new int[n];
        for(int i=0;i<m;i++)
        nums1[i] = sc.nextInt();
        for(int i=0;i<n;i++)
        nums2[i] = sc.nextInt();
        //mergeSortArray(nums1, m, nums2, n);
        alternateMergeSortArray(nums1, m, nums2, n);
    }
    public static void mergeSortArray(int nums1[], int m, int nums2[], int n){
        int arr [] = new int[m+n];
        if(m==0){
            for(int w=0;w<n;w++){
                nums1[w] = nums2[w];
            }
            return;
        }
        if(n==0){
            return;
        }
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                i++;
            }
            else{
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        if(i<=m-1)
        {
            while(i<m){
                arr[k] = nums1[i];
                i++;
                k++;
            }
        }
        if(j<=n-1)
        {
            while(j<n){
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        for(int r=0;r<n+m;r++){
            System.out.print(arr[r]+" ");
        }
    }

    public static void alternateMergeSortArray(int nums1[], int m, int nums2[], int n){
        for(int i=m,j=0; j<n; j++ ){
            nums1[i] = nums2[j];
            i++;
        } 
        Arrays.sort(nums1);
        for(int i=0;i<n+m;i++){
            System.out.print(nums1[i]+" ");
        }
    }
}