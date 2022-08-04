import java.util.Scanner;

public class Swap {
    public static void main(String[] arg){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value of A: ");
    int a= sc.nextInt();

    System.out.print("Enter value of B: ");
    int b = sc.nextInt();
    
     b =b+a;
    //  to swap the value of 'A'.
     a = b-a;
    //  to swap the value of 'B'.
     b = b-a;
     
     
     System.out.println("\nUpdated value of A: "+a);
     System.out.println("Updated value of B: "+b); 



    }
    
}
