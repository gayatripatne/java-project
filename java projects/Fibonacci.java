import java.util.Scanner;

public class Fibonacci {
    public static int fab_no(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fab_no(n - 1) + fab_no(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = sc.nextInt();
        
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fab_no(i) + " ");
        }
        sc.close();
    }
}
