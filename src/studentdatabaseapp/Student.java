package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor to prompt user to enter name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name : ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name : ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student Class Level : ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
	}
	
	// Generate an ID
	private void setStudentID() {
		id++;
		this.studentID = Integer.toString(gradeYear + id);
	}
	
	// Enroll in courses
	public void enroll() {
		System.out.print("\n");
		do {
			System.out.print("Enter Your Course to Enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n   " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);
	}
	
	// Show Balance
	public void viewBalance() {
		System.out.println("Your balance is $" + tuitionBalance);
	}
	
	// Payment
	public void payTuition() {
		System.out.print("Enter Your Payment : $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for the payment of $"+payment);
		viewBalance();
	}
	
	// Show Status
	public String showInfo() {
		return "Name : " + firstName + " " + lastName +
				"\nGrade Level : " + gradeYear +
				"\nStudent ID : " + studentID +
				"\nCourse Enrolled : " + courses +
				"\nBalance : " + tuitionBalance;
	}
}
