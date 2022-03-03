package hello;
import java.util.*;


public class Java {

  public static void main (String[] args) throws java.lang.Exception
  {


		 Scanner chu = new Scanner(System.in);
         int t = chu.nextInt();
           while (t-- > 0) {
           int x=chu.nextInt();
           int y=chu.nextInt();
           int count =x*2 + (x*y)*((x*y)-1);
           System.out.println(count);
           }
           
 }
}