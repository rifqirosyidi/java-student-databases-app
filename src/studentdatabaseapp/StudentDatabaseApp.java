package studentdatabaseapp;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// Ask how many users want to add
		Student stu1 = new Student();
		stu1.enroll();
		stu1.viewBalance();
		stu1.payTuition();
		System.out.println(stu1.showInfo());
		
		// Create number of new student

	}

}
