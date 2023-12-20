import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int secretNumber = random.nextInt(100)+1;
		int guess = 0;
		int numberOfGuess = 0;
		Scanner scan = new Scanner(System.in);
		
	   System.out.println("Welcome to the Guessing Game.");
	   System.out.println("Can you guess the number im thinking.");
	   
	   while(guess != secretNumber)
	   {
		   System.out.println("Enter the guess: ");
		   guess = scan.nextInt();
		   numberOfGuess++;
		   
		   if(guess < secretNumber)
			   System.out.println("Too low");
		   else if(guess > secretNumber)
			   System.out.println("Too high");
		   else 
			   System.out.println("Congratulations you guessed the secret number in "+numberOfGuess+".");
		   
	   }
		

	}

}
