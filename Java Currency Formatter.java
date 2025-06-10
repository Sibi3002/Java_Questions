import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Double d = sc.nextDouble();
        sc.close();
        
        Locale indianLocale =  new Locale("en", "IN");
        
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indianLocale);
        NumberFormat china =  NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france =  NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(d));
        System.out.println("India: " + india.format(d));
        System.out.println("China: " + china.format(d));
        System.out.println("France: " + france.format(d));
    }
}
