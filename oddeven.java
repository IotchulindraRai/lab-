package hello;
import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner chulin = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = chulin.nextInt();
        if(num % 2 == 0)
            System.out.println( " It is even number");
        else
            System.out.println( "  It is a  odd number");
    }
}




