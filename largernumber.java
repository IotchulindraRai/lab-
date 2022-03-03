package hello;
import java.util.Scanner;
public class largernumber
{
    public static void main(String args[])
    {
        int A, B, larger;
        Scanner iot = new Scanner(System.in);
        System.out.print("Enter two Number : ");
        A = iot.nextInt();
        B = iot.nextInt();
        if(A>B)
        {
            larger = A;
        }
        else
        {
            larger = B;
        }
        System.out.print("Largest of two Number is "+larger );
    }
}


