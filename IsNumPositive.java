import java.sql.Date;
import java.util.Scanner;

public class IsNumPositive {

	public static void main(String[] args) {
	
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("Entered number is positive.");
		}else if(num==0){
			System.out.println("Entered number is zero.");
			
		}else {
			System.out.println("Enterd number is negative.");
		}
		
		
		
		
	}
	
}
