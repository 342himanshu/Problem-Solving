package simplify_path;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SimplifyPath{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.next();

        System.out.println(simplifyPath(path));
    }

    private static String simplifyPath(String path) {
        String []str = path.split("/",-1);
        List<String> list = new ArrayList<>();
        for(int i=0;i<str.length;i++){
            if(str[i] == "")
            continue;
            else if(str[i].equals("..")){
                if(list.size() != 0)
                list.remove(list.size()-1);
            }
            else if(str[i].equals("."))
            continue;
            else
            list.add(str[i]);
        }
        String s = "";
        if(list.size() == 0)
        return "/";
        for(String a : list){
            s += "/"+a;
            //System.out.println(st.pop());
        }
        
        return s;
    }
}