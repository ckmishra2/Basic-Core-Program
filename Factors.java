package basic;
import java.util.*;
public class Factors {

    public static void primeFactors(int n)
    {
        int c = 2;
        while (n > 1) {
            if (n % c == 0) {
                System.out.print(c + " ");
                n /= c;
            }
            else
                c++;
        }
    }
 
    /* Driver code */
    public static void main(String[] args)
    {
        int n = 98;
        primeFactors(n);
    }
}
 

