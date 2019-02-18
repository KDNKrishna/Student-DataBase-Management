package StudentDataBase;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class StudentDatabase {
	
	
	private int i;
	private int balance = 3000;
	private int enrollmentCost = 600;
	private int Tuitionfee;
	private int number;
	private String name;
	private String year;
	private char grade;
	
	
	// Ask the user how many number of students will be added
	public void noofUsers(){
		System.out.println("Enter no of new students:");
		Scanner newStudent = new Scanner(System.in);
		int number = newStudent.nextInt(); 
		for(int i = 0; i<number; i++){
			//System.out.println("Enter name, year and grade:");
			Scanner newStudent1 = new Scanner(System.in);
			System.out.println("Your name:");
		    String name = newStudent1.nextLine();
		    System.out.println("your year:");
	        String year = newStudent1.nextLine();
	        System.out.println("your grade:");
	        char grade = newStudent1.next().charAt(0);
	        //To get the random 4 digit number
			Random rand = new Random();
			System.out.printf(grade + "%04d%n", rand.nextInt(10000));

		}
}
	public int nofCoursesEnrolled(){
		System.out.println("Enter the courses to enroll from the following\n1 History 101\n2 Mathematics 102\n3 English 101 \n4 Chemistry 101\n5 CS 101: ");
		Scanner course = new Scanner(System.in);
		int c = course.nextInt();
		if (c<5){
			return c;
		}
		else return 0;
		
	}
	
	
	// Pay the tuition fee
	public void payTuitionFee(){
		
		Tuitionfee = enrollmentCost * nofCoursesEnrolled();
		System.out.println("Pay the tuition fee:"+Tuitionfee);
	}
	
	//View their balance
		public void viewBalance(){
			balance = balance - Tuitionfee;
			System.out.println("View balance:"+balance);
			
		}
	
	// Status of the student
		
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StudentDatabase obj = new StudentDatabase();
		obj.noofUsers();
		obj.nofCoursesEnrolled();
		obj.payTuitionFee();
		obj.viewBalance();
		
	}

}
