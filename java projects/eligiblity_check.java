import java.util.Scanner;
public class eligiblity_check {
    public static int  age(int age){
        if(age>=18){
            System.out.println("eligible to vote");
            
        }else if (age<=18){
            System.out.println("child");

        }
        else{
            System.out.println("default");
        }
        return age;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        int result = age(age);
        System.out.println( result);
        sc.close();    }
    
}
