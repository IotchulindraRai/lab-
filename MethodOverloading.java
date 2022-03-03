package hello;

class MethodOverloading {
	
	 void add(int a,long b)
		{
			System.out.println("a method invoked");
		}  
		void sum(long a,int b)
		{
			System.out.println("b method invoked");
		}  
	  
		public static void main(String args[])
		{  
	  		MethodOverloading obj=new MethodOverloading();
	  		obj.add(20,20);
	 	 }  
	}  

