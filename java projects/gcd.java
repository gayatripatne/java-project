import java.util.Scanner;
public class gcd{
    public static int calgcd(int a , int b){
        while(b!=0){
            int gcd = b;
            b=a%b;
            a=gcd;
        }
        return a;
    }
    public static void main ( String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
         int a= sc.nextInt();
        System.out.println("enter the first number");
        int b= sc.nextInt();
        int result = calgcd(a,b);
        System.out.println("the gcd of "+ a +" and "+ b +" "+ result);
        sc.close();
    }
  }
