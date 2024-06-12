import java.lang.System;
import java.util.Scanner;

public class loops{
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*for(int j=1;j<=60;j=j+1){
        if(j%2==0){
            System.out.println("gayatri");
        }else{System.out.println("patne");}
        //for(int j=1;j<=60;j=j+1){
         // System.out.println(j+" gayatri");
    }
    int i= 0;
    while (i<11) {
        System.out.println(i+1);
        i=i+1;

        
    }
    int i= 0;
    do{
        System.out.println(i);
        i++;
    }
    while(i<11);
   
  int i =12;
  while(i<11){
    System.out.println("apna collage");
    i++;
  }*/
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int n = sc.nextInt();
  int sum = 0;

  for (int i = 1; i <= n; i++) {
      sum = sum + i;
      System.out.println(sum);
  

sc.close();}}}