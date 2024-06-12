import java.util.Scanner;

public class conditional_state {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        
        //System.out.println("enter the number",+number);

        //if(button==1){
        //    System.out.println("hello");
       // }
        //else if (button==2){
        //    System.out.println("namaste");
        //}else if(button==3) {
        //    System.out.println("bonjour");
        //}
        //else{System.out.println("invalid button");}
        switch(button){
            case 1:System.out.println("hello");
            break;
            case 2:System.out.println("namaste");
            break;
            case 3:System.out.println("bonjor");
            break;
            default:System.out.println("invalid ");
        }
    }
    
}
