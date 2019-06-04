package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// Ask how many users want to add
		System.out.print("How many students you want to enroll :");
		Scanner in = new Scanner(System.in);
		int numOfStudent = in.nextInt();
		Student[] students = new Student[numOfStudent];
		
		// Create i number of new student
		for (int i = 0; i < numOfStudent; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].viewBalance();
			students[i].payTuition();
			System.out.println(students[i].showInfo());
		}

	}

}
