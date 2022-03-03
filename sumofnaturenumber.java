package hello;

import java.util.Scanner;

public class sumofnaturenumber {
	public static void main(String[] args) {
		System.out.println("Enter the number :");
Scanner iot=new Scanner(System.in);
int num=iot.nextInt();
//sum =1+2+3+4+5
int sum=0;
for(int i=1;i<=num;i++) {
	sum=sum+i;
}
System.out.println("sum of "+num +"is"+sum);
}
}
