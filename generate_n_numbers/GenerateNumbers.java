package generate_n_numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GenerateNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        List<Integer> ans = new ArrayList<>();
        int index = 0;
        if(a == b){
            int num = 0;
            while(ans.size() < n){
                num = num*10+a;
                ans.add(num);
            }
        }
        else{
            ans.add(a);
            ans.add(b);
            while(ans.size() < n){
                int ele = ans.get(index);
                int num1 = ele*10 + a;
                int num2 = ele*10 + b;
                ans.add(num1);
                if(ans.size() < n)
                ans.add(num2);
                index++;
            }
        }
        System.out.println(ans);
    }
}