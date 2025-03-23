class One {
	int a=10;    //variable definition
	int b;      //variable definition
	
	void printDetails(){   //method
		System.out.println("From class One a ="+a);
		System.out.println("From class One b ="+b);
	
	}
	
}

class Two {
	int a,c; //declaration only
	
	void printDetails(){  //method
		System.out.println("From class Two a ="+a);
		System.out.println("From class Two a ="+c);
	}

}

class App {
	
	public static void main(String[] args){
		One o1=new One();
		Two t1=new Two();
		o1.b=100;
		o1.printDetails();
		t1.printDetails();
		t1.a=20;
		t1.c=30;
		t1.printDetails();
	}

}