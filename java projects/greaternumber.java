import java.util.Scanner;
public class greaternumber {
    public static int calgreatnumber(int a,int b){
       if(a>=b){
        System.out.println(a);
        return a ;
       }
       else{
        System.out.println(b);
       }
            return b ;
        }
        public static void main (String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a");
            int a = sc.nextInt();
            System.out.println("enter b");
            int b = sc.nextInt();
            int result = calgreatnumber(a,b);
            System.out.println("the greatest no is " + result);
            sc.close();
        }
        }
    
    

