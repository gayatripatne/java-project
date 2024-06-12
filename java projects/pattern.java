
public class pattern {
    public static void main(String[] args) {//solid rect
       /* int n=4;//rows
        int m=6;//columns
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++)
            System.out.print("*");
        
        System.out.println();
    }*/
    //hollow rect
    /*int n=4;
    int m=5;
     for(int i=1;i<=n;i++){
        for(int j =1 ;j<=m;j++){
        
          if(i==1||j==1||i==n||j==m){
            System.out.print("*");
     }else
     {
        System.out.print(" ");
    }
    }
    System.out.println();*/

//print the pattern

     /*int n=19;
    for(int i=n;i>=1;i--){
        for(int j =1;j<=i;j++){
            System.out.print("*");

        }
        System.out.println();

        {
        for(int m=1;m<=n;m++){
            for(int j =1;j<=m;j++){
                System.out.print("*");
    
            }
            System.out.println();
    
    
    }
    int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

            int n =6;
            for(int i=0;i<=n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();

                int n=10;
                for(int i=0;i<=n;i++){
                    for(int j=0;j<=n-i;j++){
                        System.out.print(j+" ");
                    }
                    System.out.println();


                    //floyd triangle
                    int n=30;
                    int number=1;
                    for(int i=1;i<=n;i++){
                        for(int j=1;j<=i;j++){
                        System.out.print(number+" ");
                        number=number+5;
                    }System.out.println();}
                    

                    int n=5;
                    
                    for(int i=1;i<=n;i++){
                        for (int j=1;j<=i;j++){
                        int sum=i+j;
                            if(sum%2==0){
                            System.out.print("1");
                            }
                            else
                            {
                                System.out.print("0");}
                        }System.out.println();
                    
                    }*/
                    int row = 5;
                    for(int i=1;i<=row;i++ ){
                        for(int j=1;j<=row-i;j++){
                            System.out.println(" " );
                        }
                    for (int j=1;j<=row;j++){
                        System.out.print("*");
                    }System.out.println();
                }}
                }
        
    


