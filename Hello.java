package hello;

	public class Hello 
	{ 
	// Declare an instance block. 
	   { 
	      show(); 
	   } 
	Hello() 
	{ 
	   System.out.println("Hello constructor"); 
	   show(); 
	} 
	void show() 
	{ 
	   System.out.println("Hello method"); 
	 } 
	} 
	public class Hi extends Hello 
	{ 
	   Hi() 
	   { 
	      System.out.println("Hi constructor"); 
	   } 
	void show() { // Override the show() method. 
	     System.out.println("Hi method"); 
	  } 
	} 
	public class TestHelloHi extends Hi
	{ 
	  public static void main(String[] args) 
	  { 
	     Hi obj = new Hi();
	      obj.show(); // show() method of Hi class is called. 

	// Superclass reference is equal to child class object. 
	     Hello obj1 = new Hi(); 
	      obj1.show();
	   } 
	}
