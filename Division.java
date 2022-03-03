package hello;

import java.util.Scanner;
 public class Division
{
public static void main(String[] args)
{
int a,b,result;
Scanner input =new Scanner(System.in);
System.out.println("Input two integers");
a=input.nextInt();
b=input.nextInt();
try
{
result=a/b;
System.out.println("Result="+result);
}
catch(ArithmeticException e)
{
System.out.println("exception caught: Divide by zero error"+e);
}
}
}