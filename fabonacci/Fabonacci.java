package fabonacci;
import java.util.HashMap;
import java.util.Scanner;

class Fabonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        HashMap<Long, Long> map = new HashMap<>();
        System.out.println(getFabonacci(n, map));
    }
    public static long getFabonacci(long n, HashMap<Long, Long> map){
        if(n ==0 )
        return 0;
        if(n <=2)
        return 1;
        if(map.containsKey(n))
        return map.get(n);

        map.put(n, getFabonacci(n-1, map) + getFabonacci(n-2, map));

        return map.get(n);
    }
}