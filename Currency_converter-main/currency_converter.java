package currency_converter;
import java.util.Scanner;
public class currency_converter 
	{
	public static void main(String args[])
	{
		        double UsdtoRupee = 82.61;
				double UsdtoEuro = 0.93;
				double Usdtojpy = 138.95;
				double UsdtoPak = 286.17;
				double UsdtoCanadian = 1.35;
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the amount in USD: ");
				
			    double Usd_Amount = 0.0;
			    try
			    {
			    	Usd_Amount = scan.nextDouble();
			    } 
			    catch (Exception e)
			    {
			    	System.out.println("Invalid Amount. Terminating the program.");
			    	System.exit(0);
			    }
			    
			    int choice = 0;
			    System.out.println("Select the converstion");
			    System.out.println("1. Convert To Rupee");
			    System.out.println("2. Convert To Euros ");
			    System.out.println("3. Convert To yen");
			    System.out.println("4. Convert To Pkr");
			    System.out.println("5. Convert To Canadian");
			    System.out.println("Enter the number from 1-5:");
			    
			  
			    try {
			    	 choice = scan.nextInt();
			    }
			    catch(Exception e)
			    {
			    	System.out.println("Entered the wrong choice. Terminating the program");
			    	System.exit(0);
			    }
			    
			    double Converted_Amount = 0.0;
			    String Currency_Symbol= "";
			    switch(choice)
			    {
			    case 1: 
			    	Converted_Amount = Usd_Amount * UsdtoRupee;
			    	Currency_Symbol = "₹";
			    break;
			    case 2:
			    	Converted_Amount = Usd_Amount * UsdtoEuro;
			    	Currency_Symbol = "£";
			    break;
			    
			    case 3:
			    	Converted_Amount = Usd_Amount * Usdtojpy;
			    	Currency_Symbol = "¥";
			    break;
			    
			    case 4:
			    	Converted_Amount = Usd_Amount * UsdtoPak;
			    	Currency_Symbol = "₨";
			    break;
			    
			    case 5:
			    	Converted_Amount = Usd_Amount *  UsdtoCanadian;
			    	Currency_Symbol = "$";
			    break;
			    
			    default:
			    	System.out.println("Please enter the valid number.Teminating program.");
			    	System.exit(0);
			    
			    }
			    System.out.println("The converted amount:");
			  System.out.print( Converted_Amount );
			  System.out.print( Currency_Symbol);
	          scan.close();
	}
	
	
	}

























