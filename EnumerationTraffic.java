package hello;
enum Trafficsignal{
    RED("STOP"),GREEN("GO"),YELLOW("SLOW DOWN");
    String action;
    Trafficsignal(String a){
       this.action=a;
    }
      public String getAction(){
         return action;
      }
}
   
public class EnumerationTraffic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Trafficsignal s= Trafficsignal.YELLOW;

      System.out.println(s.getAction());
    }
}

