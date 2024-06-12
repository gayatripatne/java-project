import java.util.Scanner;
public class circumference {
    public static double takeradius(int r){
        double m = 2*3.14*r;
        return m;
    }
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        double result = takeradius(r);
        System.out.println("the circumference is " + result);
        sc.close();
    }
}
