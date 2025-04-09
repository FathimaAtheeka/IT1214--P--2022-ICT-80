class Student{
	String name= "Rimza";
	int marks=100;
	
	Student(){ //default constructor
		name="NoName";
	}
	
	Student(String n){
		name=n;
	}
	
	Student(String n, int m){
		name=n;
		marks=m;
	}

}


class StudentDemo{
	public static void main(String[] args){
		System.out.println("Hi from Student Demo class");
		System.out.println("Creating an object of Student Class");
		
		Student s1=new Student("Nice Name",85);
		System.out.println("Creating an object of Student Class");
		
		System.out.println("Name value of the object is "+ s1.name );
		System.out.println("Marks value of the object is "+ s1.marks );
		
		s1.name="Atheeka"; //setting the variable value
		s1.marks=100;
		
		System.out.println("Name value of the object is "+ s1.name );//getting the variable value
		System.out.println("Marks value of the object is "+ s1.marks );
	}
}