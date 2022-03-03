
/*1. A) Create a Java class called Student with the following details as variables within it.
(i) USN
(ii) Name
(iii) Branch
(iv) Phone
Write a Java program to create nStudent objects and print the USN, Name, Branch, and Phone of
these objects with suitable headings. */

package hello;
import java.util.Scanner; 
public class student3
{
           String USN;
           String Name;
           String branch;
           int phone;
void insertRecord(String reg,String name, String brnch,int ph) {
USN=reg;
Name=name;
branch=brnch; 
phone=ph;
}
void displayRecord()
{
System.out.println(USN+" "+Name+" "+branch+" "+phone);
}

public static void main(String args[])
{ 
student3 s[]=new student3 [100]; 
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of students");
int n=sc.nextInt();
for(int i=0;i<n;i++)  
     s[i]=new student3();
for(int j=0;j<n;j++)
{    
	System.out.println("enter the usn,name,branch,phone");
        String USN=sc.next();    
        String Name=sc.next();    
       String branch=sc.next();     
        int phone=sc.nextInt();
   s[j].insertRecord(USN,Name,branch,phone);

}

for( int m=0;m<n;m++)
{
 s[m].displayRecord();
}

}
}
