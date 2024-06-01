package gas_station;

import java.util.Scanner;

class GasStation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gas[] = new int[n];
        
        int cost[] = new int[n];

        for(int i=0;i<n;i++)
        gas[i] = sc.nextInt();
        for(int i=0;i<n;i++)
        cost[i] = sc.nextInt();

        System.out.println(isPossible(gas, cost));

    }
    public static int isPossible(int []gas, int []cost){
        int n = gas.length;
        int total=0, avail=0, in=0;
        for(int i=0;i<n;i++){
            total += gas[i]-cost[i];
            avail += gas[i] - cost[i];
            if(avail<0){
                avail=0;
                in = i+1;
            }
        }
        if(total<0){
            return -1;
        }
        return in;
    }
}
