package letter_combination_of_a_phone_number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LetterCombination{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> ans = letterCombinations(s);
        System.out.println(ans);
    }
     public static void solve(String digits, int index, List<String> ans, String []arr, String s){
        // base case
        if(index >= digits.length()){
            ans.add(s);
            return;
        }
        int ind = digits.charAt(index) - '0';
        String str = arr[ind];
        for(int i=0;i<str.length();i++){
            s += String.valueOf(str.charAt(i));
            solve(digits,index+1,ans,arr,s);
            s = s.substring(0,s.length()-1);
        }
    }
    public static List<String> letterCombinations(String digits) {
        String arr[] = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;
        solve(digits,0,ans,arr,"");
        return ans;
    }
}