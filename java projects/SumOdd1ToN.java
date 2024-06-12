/*import java.util.Scanner;
public class sum_odd_1ton {
    public static int calsum(int n){
        int sum = 0;
        for(int i=1;i<=n;i+=2){
            sum+=1;
            
            }
            return sum;
        }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int result = calsum(n);
        System.out.println("the sum is odd no. from 1 to" + n "is" + result);
        sc.close();
    }
}
*/
import java.util.Scanner;

public class SumOdd1ToN {

    public static int calsum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int result = calsum(n);
        System.out.println("The sum of odd numbers from 1 to " + n + " is " + result);
        sc.close();
    }
}
