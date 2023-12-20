import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGradeBook {
	
	public static void main(String args[])
	{
		System.out.println("Enter number of students: ");
		Scanner scan = new Scanner(System.in);
		
		int numStudents = scan.nextInt();
		scan.nextLine(); // consume the next line character 
		
		List<Student> students = new ArrayList<>();  // type var =  new obj interface as array list 
		
		for (int i =0; i< numStudents; i++ )
		{
			
			System.out.println("Enter the name of student "+(i + 1)+ ":");
			
			String name = scan.nextLine();
			Student student = new Student(name);
			
			System.out.println("Enter the number of subjects: ");
			
			int numSubjects = scan.nextInt();
			scan.nextLine();
			
			for (int j=0; j < numStudents; j++ )
			{
				System.out.println("Enter the name of subject " +(j + 1)+ ":");
				
				String subject = scan.nextLine();
				System.out.println("Enter the grade of subject " +(j + 1)+ ":");
				double grade = scan.nextDouble();
				scan.nextLine();
				
				student.addGrade(subject, grade);
	
				
			}
			students.add(student); // add() method adds student records
			System.out.println();
			
		}
		System.out.println("Students Gradebook: ");
		
		for (Student student : students)
		{
			student.printGrades();
			System.out.println("Average Grade: " + student.getAverageGrade());
			System.out.println();
		}
		
	}

}
