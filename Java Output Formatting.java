import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int siz = 15 - s1.length();
                String s2=" ".repeat(siz);
                String s = s1+s2;
                int x=sc.nextInt();
                //Complete this line
                
                System.out.print(s);
                String form = String.format("%03d", x);
                System.out.println(form);
            }
            System.out.println("================================");

    }
}



