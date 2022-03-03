package hello;

 abstract class Motorbike {
		  abstract void brake();
		}

		class Sportsbike extends Motorbike {
		    
		  // implementation of abstract method
		  public void brake() {
		    System.out.println("Sportsbike Brake");
		  }
		}

		class Mountainbike extends Motorbike {
		    
		  // implementation of abstract method
		  public void brake() {
		    System.out.println("Mountainbike Brake");
		  }
		}

		class Main {
		  public static void main(String[] args) {
		    Mountainbike m1 = new Mountainbike();
		    m1.brake();
		    Sportsbike s1 = new Sportsbike();
		    s1.brake();
		  }
		}