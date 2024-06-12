import java.util.Scanner;
public class powernumber {
    public static double powerthenumber(int x,int n){
        return Math.pow(x, n);
    }
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x");
        int x=sc.nextInt();
        System.out.println("enter the n");
        int n=sc.nextInt();
        double result = powerthenumber(x,n);
        System.out.println("your result is " + result);
        sc.close();
    }
}
