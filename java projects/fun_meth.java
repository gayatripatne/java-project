//import java.util.*;
import java.util.Scanner;

public class fun_meth {
   /* public static void printMyName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner();
        String name = sc.next();
        printMyName(name);
        //sc.close();
    }*/  public static int calculatesum(int a,int b) {
        int sum = a+b;
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculatesum (a,b);
        System.out.println("the sum is"+sum);
        sc.close();
     }
    
}
