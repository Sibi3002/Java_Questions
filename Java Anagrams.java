import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String A = new String();
        A = sc.next().toLowerCase();
        String B = new String();
        B = sc.next().toLowerCase();        
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        
        for(char x: A.toCharArray()){
            if(h1.get(x) != null)
                h1.put(x, h1.get(x) + 1);
            else   
                h1.put(x, 1);
        }
        for(char x: B.toCharArray()){
            if(h2.get(x) != null)
                h2.put(x, h2.get(x) + 1);
            else   
                h2.put(x, 1);
        }
        if(h1.equals(h2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
        sc.close();
    }
}
