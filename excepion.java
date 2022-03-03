package hello;
class trea extends Exception {}
class Derived extends trea {}

public class excepion {
public static void main(String args[]) {
// some other stuff
try {
// Some monitored code
throw new Derived();
} catch(trea b) {
System.out.println("Caught base class exception"); }
catch(Derived d) {
System.out.println("Caught derived class exception"); }
}
}
