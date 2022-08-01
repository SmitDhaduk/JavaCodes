import java.sql.Date;
import java.util.Scanner;

public class CalcUsingSwitch {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entered any number for calculation: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		
		System.out.println("Choose any operation from below: ");
		
		System.out.println(" +,-,*,/");
		
		String operation = sc.next();
		
		switch(operation) {
		
		case "+":
			System.out.println(num1+num2);
			break;
		case "_":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		default:
			System.out.println("Please enter valid operation");
			break;
			
		}	
		
	}
	
}
