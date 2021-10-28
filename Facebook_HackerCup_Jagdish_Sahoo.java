import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        int cases = 1;
        while(cases <= t){
            int n = Integer.parseInt(in.readLine());
            String s = in.readLine();
            int ans = 0, count = 0;
            char prevChar = 'X';
            for(char c : s.toCharArray()){
                if(c == 'X' || c == 'O'){
                    count++;
                    if(prevChar != c && count > 1){
                        prevChar = c;
                        ans++;
                    }else if(prevChar != c && count == 1){
                        prevChar = c;
                    }
                }
            }
            out.println("Case #" + cases + ": " + ans);
            cases++;
        }
        in.close();
        out.close();
    }
}