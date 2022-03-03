package hello;
import java.util.*;
public class Gfdthello {

	
	
	public static void main(String args[])
	{
		GregorianCalendar gc=new GregorianCalendar();
	int year=gc.get(Calendar.YEAR);
	System.out.println("Current Year : "+year);
	System.out.println("Is Leap Year : "+gc.isLeapYear(year));
	System.out.println("Current month: "+gc.get(Calendar.MONTH));
	System.out.println("Week of Year : "+gc.get(Calendar.WEEK_OF_YEAR));
	System.out.println("Week of month: "+gc.get(Calendar.WEEK_OF_MONTH));
	System.out.println("Day of Year : "+gc.get(Calendar.DAY_OF_YEAR));
	System.out.println("Day of Week : "+gc.get(Calendar.DAY_OF_WEEK));
	}
	}