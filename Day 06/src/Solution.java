import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=0; i<n; i++){
            String s = scanner.nextLine();
            String s_even = "", s_odd = "";
            for(int j= 0; j < s.length(); j++ ){
                if(j % 2 > 0){ //odd-indexed
                    s_odd += s.charAt(j);
                }else{ // even-indexed
                    s_even += s.charAt(j);
                }
            }
            System.out.printf("%s %s\n",s_even,s_odd);
        }
        scanner.close();
    }
}



