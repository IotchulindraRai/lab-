/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author skby
 */
import java.util.Scanner;
public class jv1
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
jv1 s[]=new jv1[100]; 
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of students");
int n=sc.nextInt();
for(int i=0;i<n;i++)  
      s[i]=new jv1();
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
