import java.util.*;

public class Student {
	
	private String name;
	private Map<String , Double> grades;// sting for subject and double is for grade
	
	public  Student(String name)
	{
		this.name = name;//pointing to particular var 
		this.grades = new HashMap<>();// creating a hashmap obj. <> is the inference
		//allowing the compiler to infer the types based on the declaration as Map<string , double>
	}
	
	public void addGrade(String subject, double grade)
	{
		grades.put(subject, grade);
		
	}
	
	public double getAverageGrade()
	{
		double sum= 0.0;// var declaration
		
		for (double grade : grades.values())// values method
		{
			sum+= grade;// we are taking only values from the map by iterating each time and adding to the sum
			
		}
		return sum / grades.size();//size method return the total entry of key value pairs
	}
	
	public void printGrades()
	{
		System.out.println("Grades for " + name + ":");
		
		for(Map.Entry<String, Double> entry : grades.entrySet())// entry set gives the set view
		{ 
			// here entry is a var type is <string,double> for each iteration it assigns a key value
			System.out.println(entry.getKey()+":"+  entry.getValue());
		}
	}

}
