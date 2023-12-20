import java.util.Scanner;

class Question{
	
	private String question;
	private String[] options;
	private int correctOption;
	
	public Question(String question, String[] options, int correctOption)
	{
		this.question = question;
		this.options = options;
		this.correctOption= correctOption;
	}
	
	public boolean isCorrect(int userChoice)
	{
		return userChoice == correctOption;
	}
	
	public void  displayQuestion()
	{
		System.out.println(question);
		
		for(int i =0; i < options.length; i++)
		{
			System.out.println((i + 1) +". "+ options[i]);
		}
	}
	
	public String[] getOptions()
	{
		return options;
	}
}

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Question[] questions = 
				
			{ //Yes, you're correct! When you create an object of a class in Java, you can create as many instances of that object as you want. 
					//Each instance is a separate copy of the object with its own set of data and behaviors.
			    new Question ("What is the National Space Day", 
							new String[] {"March 23-2023", "April 23-2022", "August 23-2023","December 23-2024"}, 3),
				new Question("what is the captal of India?",
						new String[] {"Hyderabad", "Mumbai", "Jammu&Kashmir", "Delhi"}, 4),
	            new Question("Which planet is known as the Red Planet?",
	                    new String[]{"Mars", "Venus", "Jupiter", "Mercury"}, 1),
	                new Question("What is 2 + 2?",
	                    new String[]{"3", "4", "5", "6"}, 2)
			};
		
		int score = 0;
		System.out.println("Welcome to Quiz Application");
		
		for(Question question: questions)
		{
			question.displayQuestion();
			System.out.println("Enter your answer (1-"+question.getOptions().length + "): ");
		    int userChoice = scan.nextInt();
		    
		    if (userChoice >=1 && userChoice <= question.getOptions().length)
		    {
		    	if(question.isCorrect(userChoice))
		    	{
		    		System.out.println("Correct Answer\n");
		    		score++;
		    	}
		    	else
		    	{
		    		System.out.println("Incorrect Answer\n");
		    	}
		    	
		    }
		    else {
		    	System.out.println("Invalid Choise\n");
		    }
		}
			
		System.out.println("Quiz Completed! Your Score is: "+ score+"/" +questions.length+".");
		

	}

}
