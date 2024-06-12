import java.util.ArrayList;
import java.util.Scanner;

public class integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many numbers do you want to input? ");
        int numInputs = scanner.nextInt();
        
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        ArrayList<Integer> zeroNumbers = new ArrayList<>();
        
        System.out.println("Enter the numbers:");
        for (int i = 0; i < numInputs; i++) {
            int number = scanner.nextInt();
            if (number > 0) {
                positiveNumbers.add(number);
            } else if (number < 0) {
                negativeNumbers.add(number);
            } else {
                zeroNumbers.add(number);
            }
        }
        
        System.out.println("Positive numbers: " + positiveNumbers);
        System.out.println("Negative numbers: " + negativeNumbers);
        System.out.println("Zero numbers: " + zeroNumbers);
        
        scanner.close();
    }
}
