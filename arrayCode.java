import java.sql.Date;
import java.util.Scanner;

public class functions {

	public static void main(String[] args) {
	
		int n = 0;
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter your array : ");
		n = sc.nextInt();
		int[] testArray = new int[n];

		
		System.out.println("Enter your array : ");
		
		
		for(int i =0; i<n; i++ ) {
			
			testArray[i] = sc.nextInt();
			
		}
		
		System.out.println("Your array are : ");

		
		for(int j = 0; j<n;j++) {
			
			System.out.println(testArray[j]);
		}
		
		
	}
	
}
