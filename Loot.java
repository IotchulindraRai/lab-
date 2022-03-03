        
import java.util.*;
import java.lang.*;
import java.io.*;

 
class Loot
{
  public static void main (String[] args) throws java.lang.Exception
  {
    
     Scanner chulindra = new Scanner(System.in);
          int t = chulindra.nextInt();
            while (t-- > 0) {
            int x=chulindra.nextInt();
            int y=chulindra.nextInt();
            int count =x*2 + (x*y)*((x*y)-1);
            System.out.println(count);
            }
            
  }
}	