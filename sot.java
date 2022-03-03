/**
 * author Chulindra Rai
 */
package hello;

public class sot {
	public static void main(String [] args) {
		 //Initialize array  
        int a[]  = {1, 10, 20, 3,40, 5};  
        int sum = 0;  
        //Loop  
        //for (int i = 0; i < a.length; i++) {  
        for(int i:a) {
           sum = sum + i;  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  

			
		}

