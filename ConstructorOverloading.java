package hello;

public class ConstructorOverloading {

	   private int rollNum;
	   ConstructorOverloading()
	   {
	      rollNum =550;
	   }
	 ConstructorOverloading(int rnum)
	   {
	      this();
	      /*this() is used for calling the default  
	       * constructor from parameterized constructor.
	       * It should always be the first statement 
	       * inside constructor body.
	       */
	      rollNum = rollNum+ rnum;
	   }
	   public int getRollNum() {
		  return rollNum;
	   }
	   public void setRollNum(int rollNum) {
		  this.rollNum = rollNum;
	   }
	   public static void main(String args[])
	   {
		ConstructorOverloading obj = new ConstructorOverloading(45);
	       System.out.println(obj.getRollNum());
	    }
	}

