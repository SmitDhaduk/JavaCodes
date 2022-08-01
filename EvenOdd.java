import java.sql.Date;
import java.util.Scanner;

public class  EvenOdd{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check either is it Even or Add !");
		int num = sc.nextInt();
		if(num%2==0){
			System.out.println("number is even");
		}else{
			System.out.println("number is odd");

		}
		
	}
	
}
