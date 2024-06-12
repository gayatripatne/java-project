import java.util.Scanner;

public class arithmaticoperation{
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
  // int a = sc.nextInt();
   System.out.println("enter the a");
   int a = sc.nextInt();
   //int b = sc.nextInt();
   System.out.println("enter the b");
   int b = sc.nextInt();
   //int button = sc.nextInt();
   System.out.println("select button from 1 to 4");
   int button = sc.nextInt();


   switch(button){
   case 1 : System.out.println("the sum is" + a+b);
   break;
   case 2 :System.out.println("the substraction is" + (a-b));
   break;
   case 3 :System.out.println("the multiplication is " + a*b);
   break;
   case 4 :System.out.println("the division is " + a/b);
   break;
   default:System.out.println("invalid");
   }
   sc.close();
 }

}