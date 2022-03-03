package hello;
import java.util.*;
import java.lang.*;
class QueueError extends Exception
{
public QueueError(String msg)
{
super(msg);
}
}
class Que
{
private int size;
private int front = -1;
private int rear = -1;
private Integer[] queArr;
public Que(int size)
{
this.size = size;
queArr = new Integer[size];
}
public void insert(int item) throws Exception, QueueError
{
try
{
if(rear == size-1)
{
throw new QueueError("Queue Overflow");
}
else if(front==-1)
{
rear++;
queArr[rear] = item;
front = rear;
}
else
{
rear++;
queArr[rear] = item;
}
}
catch(QueueError qe)
{
qe.printStackTrace();
}
}
public void delete() throws Exception,QueueError
{
try
{
if(front == -1)
{
throw new QueueError("Queue Underflow");
}
else if(front==rear)
{
System.out.println("\nRemoved "+queArr[front]+" from Queue");
queArr[front] = null;
front--;
rear--;
}
else
{
System.out.println("\nRemoved "+queArr[front]+" from Queue");
queArr[front] = null;
for(int i=front+1;i<=rear;i++)
{
queArr[i-1]=queArr[i];
}
rear--;
}
}
catch(QueueError qe)
{
qe.printStackTrace();
}
}
public void display() throws Exception,QueueError
{
try
{
if(front==-1)
throw new QueueError("Queue is Empty");
else
{
System.out.print("\nQueue is: ");
for(int i=front;i<=rear;i++)
{
System.out.print(queArr[i]+"\t");
}
System.out.println();
}
}
catch(QueueError qe)
{
qe.printStackTrace();
}
}
}
class prog6
{
public static void main(String[] args) throws Exception,QueueError
{
System.out.println("\n\n\tQueue test using Array\n\n");
Scanner scan = new Scanner(System.in);
System.out.print("Enter size of Queue array: ");
int size = scan.nextInt();
Que que = new Que(size);
char ch;
try
{
while(true)
{
System.out.println("\n\n\tQueue operations \n");
System.out.println("1. Insert");
System.out.println("2. Delete");
System.out.println("3. Display");
System.out.println("4. Exit\n");
System.out.print("Enter your choice: ");
int choice = scan.nextInt();
switch(choice)
{
case 1: System.out.print("\nEnter integer number to insert: ");
que.insert(scan.nextInt());
break;
case 2:que.delete();
break;
case 3:que.display();
break;
case 4:return ;
}
}
}
catch(QueueError qe)
{
qe.printStackTrace();
}
}
}
	