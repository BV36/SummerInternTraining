package botanvargunday_1;


class Student{
	String name;
	int age;
	String department;
	int studentNumber;
	double gpa;	
	

	Student(String name, int age, String department, int studentNumber, double gpa){
		this.name = name;
		this.age = age;
		this.department = department;
		this.studentNumber = studentNumber;
		this.gpa = gpa;
		
	}
	
	void display(){
		System.out.println("Student Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Department: " + department);
		System.out.println("Student Number: " + studentNumber);
		System.out.println("GPA: " + gpa);
	}
	 
}


public class Day1 {

	
	

	public static void main(String[] args) {
		Student s1 = new Student("Ali", 21, "Software Engineering", 230504000, 3.28);
		s1.display();

	}

}
