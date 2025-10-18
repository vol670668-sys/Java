class Person{
	private String name;
	private int age;
	private String gender;
	public Person(String name,int age,String gender)
	{this.name=name;
	this.age=age;
	this.gender=gender;
	}
	public void display(){
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Gender: "+gender);
	}
}
class Student extends Person {
	private String studentId;
	private String course;
	public Student(String name,int age,String gender,String studentId,String course){
		super(name,age,gender);
		this.studentId=	studentId;
		this.course=course;
	}
	
	public void display(){
	super.display();
	System.out.println("Student ID: "+studentId);	
	System.out.println("Course: "+course);
	System.out.println("------- ");
	}
}

class Employee extends Person{
	private String empId;
	private String department;
	public Employee(String name,int age,String gender,String empId,String department){
		super(name,age,gender);
		this.empId=empId;
		this.department=department;
	}
}
public class InheritanceDemo{
	public static void main(String[] args){
	Student[] students={
	new Student("Alice",20,"female","S101","CS"),
	new Student("Bob",19,"male","S102","ECE"),
	new Student("Candice",18,"female","S103","CS"),
	new Student("Kiddo",19,"male","S104","Mech"),
	new Student("Shawn",20,"female","S105","ECE"),
	};
	
	Employee[] employees={
	new Employee("Raj",30,"Male","E201","HR"),
	new Employee("Meena",28,"Female","E202","Finance"),
	new Employee("Raj",30,"Male","E203","IT"),
	new Employee("Raj",30,"Male","E204","Marketing"),
	new Employee("Raj",30,"Male","E205","Operations")
	};
	
	System.out.println("---Students Details---");
	for(Student s:students){
	s.display();
	}
	System.out.println("---Employee Details---");
	for(Employee e:employees){
	e.display();
	}
	}
	}
	
