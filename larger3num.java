package hello;
import java.util.Scanner;
public class larger3num 
{
    public static void main(String[] args) 
    {
        int A, B, C;
        Scanner iot = new Scanner(System.in);
        System.out.print("Enter the first number:");
        A = iot.nextInt();
        System.out.print("Enter the second number:");
        B = iot.nextInt();
        System.out.print("Enter the third number:");
        C = iot.nextInt();
        if(A > B && A > C)
        {
            System.out.println("Largest number is:"+A);
        }
        else if(B > C)
        {
            System.out.println("Largest number is:"+B);
        }
        else
        {
            System.out.println("Largest number is:"+C);
        }
 
    }
}
