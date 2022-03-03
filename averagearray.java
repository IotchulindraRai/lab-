/**
 * Chulindra Rai
 */
package hello;
public class averagearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[]{10, 20, 30, 60, 80, 100};       
	       int sum = 0;
	       for(int i=0; i < num.length ; i++)
	        sum = sum + num[i];
	       //calculate average value
	        double avg = sum / num.length;
	        System.out.println("Average value of the array elements is : " + avg); 
	   }
	}

	