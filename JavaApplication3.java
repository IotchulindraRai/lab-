
package javaapplication2;

 import  java.io.*; 
    public class JavaApplication3 {
{
    
}
    static int max=10,i,top,ch,item;
    static int a[]=new int[10];
  JavaApplication3()
    {
        top=-1;
    }
    public static void main(String args[])throws IOException //
    {
        while((boolean)true)  //while loop
        {
            System.out.println("enter 1.Push 2.Pop 3.Display 4.Exit");
 
            try
            {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                ch=Integer.parseInt(br.readLine());
            }
            catch(java.lang.Exception e) { }
            if(ch==4)
                break;
            else
            {
                switch(ch)
                {
                case 1:
                    push();    // // Pushing element
                    break;
                case 2:
                    pop();     //pop from stack
                    break;
                case 3:
                    display();    //disply
                    break;
                }
            }
        }
    }
    static void push()
    {
        if(top==max) //condition
            System.out.println("stack is full");
        else
 
            try
            {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter the element:");
                item=Integer.parseInt(br.readLine());
                a[++top]=item;
            }
            catch(java.lang.Exception e) { }
    }
    static void pop()
    {
        if(top==-1)
            System.out.println("stack is empty");
        else
            top--;
        System.out.println("poped item:"+a[top]);
    }
    static void display()
    {
        System.out.println("elements in stack are:");
        for(i=top; i>0; i--)
            System.out.println(a[i]);
    }
}

