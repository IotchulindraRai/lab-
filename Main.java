package hello;

import java.util.Scanner;
enum week
{
	Sunday,Monday,tuesday,Wednesday,Thursday, Friday, Saturday;
	boolean WorkDay()
	{
		if(ordinal()==0||ordinal()==6)
			return false;
		else
			return true;
	
	
	}
}
public class Main{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		week day;
		System.out.println("enter a Day");
		String d=s.next();
		day=week.valueOf(d);
		System.out.println("Is the WorkDay? ANS"+day.WorkDay());
	}
	
}