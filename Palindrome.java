package hello;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a,b;
StringBuffer sb;
Scanner sc =new Scanner(System.in);
System.out.print("Enter string to be check :");
a=sc.nextLine();
sb=new StringBuffer(a);
b=sb.reverse().toString();
if(a.equals(b))
{
	System.out.print("entered String is palindrome");
}
else
{
	System.out.print("Entered string is not palindrome");
}
	}

}
