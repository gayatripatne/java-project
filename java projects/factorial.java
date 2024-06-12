import java.util.Scanner;

public class factorial {

    public static int calculateFactorial(int n) {
        if(n<=0){
            System.out.print("invalid");
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        // Return the calculated factorial value after the loop completes
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int n = sc.nextInt();

        int result = calculateFactorial(n); // Call the method and store the result
        System.out.println("The factorial of " + n + " is: " + result);

        sc.close();
    }
}
