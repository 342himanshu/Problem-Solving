package merged_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class MergedInterval{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        arr = merged(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }

    private static int[][] merged(int[][] intervals) {
        int n = intervals.length;

        if(intervals == null || n == 0)
        return new int[0][];

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        int mergedInterval[] = intervals[0];

        List<int []> merged = new ArrayList<>();

        for(int i=1;i<n;i++){
            int interval[] = intervals[i];
            if(mergedInterval[1]>=interval[0]){
                mergedInterval[1] = Math.max(mergedInterval[1],interval[1]);
            }
            else{
                merged.add(mergedInterval);
                mergedInterval = interval;
            }
        }
        merged.add(mergedInterval);

        return merged.toArray(new int[merged.size()][]);
    }
}