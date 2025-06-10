import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder A1 = new StringBuilder(A);
        StringBuilder A2 = new StringBuilder();
        for(int i=A.length()-1;i>=0;i--){
            A2.append(A1.charAt(i));
        }
        if(A1.toString().equals(A2.toString()))
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}



