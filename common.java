package hello;

import java.util.Scanner;

public class common {
    public static void main(String[] args){
        int a, b , tmp=0;
        System.out.println("Enter first number to be swap ");
        Scanner chulin = new Scanner(System.in);
        a = chulin.nextInt();
        System.out.println("Enter Second number  to be swap");
        b = chulin.nextInt();
        System.out.println("Before swapping values are a="+a+" "+"b="+b);
        tmp =a;
        a = b;
        b = tmp;
        System.out.println("Swapped values are a="+a+" "+"b="+b);

    }
}