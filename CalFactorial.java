//In this pogram, 
import java.sql.Date;
import java.util.*;

public class  CalFactorial{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//if your enter any numner then it will give output of  the factorial of it.
    	System.out.println("Enter a number to calculate factorial : ");

		int number = sc.nextInt();
		
		int fact=1;  
		int i=1;
       while(i<=number){
      fact=fact*i;    
	  i++;    

  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
	
}
