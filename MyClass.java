package lab.Saturday;

public class MyClass {
	
	private int x = 5;
	
	//create method
	public void printString() {
		System.out.println ("Print this string!");
	}

	
    //create a method with the parameters
	public void number(int xNumber) {
	System.out.println("xNumber is: " + xNumber);
	
	}
	
	public static void main(String[] args) {
		//create an object of type MyClass
		
		MyClass myObj = new MyClass();
		myObj.printString();
		System.out.println("My object x is: " + myObj.x);
		myObj.number (333);
	}
	

}
