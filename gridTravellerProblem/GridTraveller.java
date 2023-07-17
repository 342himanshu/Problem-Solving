package gridTravellerProblem;

import java.util.Scanner;

public class GridTraveller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long arr[][] = new long[n+1][m+110 ];
        System.out.println(gridTraveller(n, m, arr));
    }

    public static long gridTraveller(int n, int m, long arr[][]){
        if(n==1 && m==1)
        return 1;
        if(n==0 || m==0)
        return 0;
        if(arr[n][m] != 0)
        return arr[n][m];
        arr[n][m] = gridTraveller(n-1, m, arr) + gridTraveller(n, m-1, arr);
        return arr[n][m];
    }
    
}
