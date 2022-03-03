//this keyword program
package hello;

public class ThisKeyword 
{
	int id; String name;
	ThisKeyword (int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
	System.out.println(id+" "+name);
	}

	public static void main(String args[])
	{

		ThisKeyword  sl = new ThisKeyword (1,"K");

	ThisKeyword  s2= new ThisKeyword (3,"T");
	sl.display();

	s2.display();
	
	}

}
