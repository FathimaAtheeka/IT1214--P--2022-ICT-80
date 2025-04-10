class Student{
  int marks;
  String name;
  
  Student(){
     System.out.println("Creating a Student object");	
     //name="Default Name";	 
  }
  Student(String n,int m){
	  System.out.println("Creating a Student object with name "+ n +" and Marks "+m);
  }
}

class Printer{
	void pr(String s){
		System.out.println(s);
	}
}

class App{
	public static void main(String[] args){
		Printer p=new Printer();
		p.pr("Welcome to Demo class App");
		
		Student s1=new Student();	
		//s1.marks=100;
		//p.pr("The marks of the "+s1.name+ " is "+s1.marks);
	    //s1.name="Alice";
		//p.pr("The marks of the "+s1.name+ " is "+s1.marks);
		
		Student s2=new Student("Bob", 50);		
		//s2.marks=50;
		//s2.name="Bob";
		p.pr("The marks of the "+s2.name+ " is "+s2.marks);
	}
}