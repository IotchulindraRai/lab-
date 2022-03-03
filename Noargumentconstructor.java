package hello;
class Add{

int x,y;

Add(){

x=10;

y=20;

System.out.println("No argument constructor");
}
void sum(){

int c= x+y;

System.out.println("Sum="+ c);
}
}
public class Noargumentconstructor {

public static void main(String[] args) {

	Add a= new Add();

a.sum();
}
}