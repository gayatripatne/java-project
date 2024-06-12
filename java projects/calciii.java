import java.util.Scanner;
  public class calciii {
    public static int claculatesum(int a , int b){
        return a+b;
    }
    public static int claculatesub(int a , int b){
        return a-b;
    }
    public static int claculatediv(int a , int b){
        return a/b;
    }
    public static int claculateproduct(int a , int b){
        return a*b;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("product of numbers is " + claculateproduct( a ,b));
        System.out.println("sum of numbers is " + claculatesum( a ,b));
        System.out.println("sub of numbers is " + claculatesub( a ,b));
        System.out.println("div of numbers is " + claculatediv( a ,b));
        sc.close();
    }
    }


            