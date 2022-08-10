import java.util.Scanner;

public class PyramidPattern {
   public static void main(String args[]) {


    // In this code will create pyramid using for loop.
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the row size:");
       int rowSize = sc.nextInt();
       int i;

       System.out.println();

       for( i = 0; i<rowSize; i++){
        
            int whiteSpace=rowSize - i ;

            for( int j = 0;j<whiteSpace;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i; k++){
               System.out.print(i+" ");
           }
           System.out.println();

       }
       
   }
}