import java.util.Scanner;
public class classi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter first number");
		num1 = scan.nextInt();
		System.out.println("Enter Second number");
		num2 = scan.nextInt();
		System.out.println("Menu");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int choice;
		int result = 0;
		choice = scan.nextInt();
		
		switch(choice)
		{
		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 - num2;
			break;
		case 3:
			result = num1 * num2;
			break;
		case 4:
			if (num1 == 0 || num2 == 0)
				System.out.println("Please Enter a valid numbers");
			else
				result = num1 / num2;
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		System.out.println("Result:" +result);

	}

}
