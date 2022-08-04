import java.sql.Date;
import java.text.NumberFormat;
import java.util.*;

public class  MortgageCalc{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle amount: ");
        int principle_amout = sc.nextInt();

        System.out.println("Enter the annual interest rate: ");
        float annual_interest = sc.nextFloat();

        float monthly_interest = (annual_interest/12)/100;
        
        System.out.println("Enter the period of the loan: ");

        float duration = sc.nextFloat();
        
        float totalMonth = duration*12;

        double result = principle_amout*(
                            (monthly_interest*
                            (Math.pow(1+monthly_interest,totalMonth)))
                            /
                            (Math.pow(1+monthly_interest,totalMonth)-1  ) );


        String mortgage  = NumberFormat.getCurrencyInstance().format(result);

        System.out.println("Monthly EMI is : "+mortgage);                    


		
	}
	
}
