package hello;

import java.util.Scanner;

public class Roy {

	public static void main(String[] args) throws  Exception{
		int L=0,N=0,W=0,H=0;
			// TODO Auto-generated method stub
	Scanner S = new Scanner(System.in);
	L= S.nextInt();
	N= S.nextInt();
	while(N!=0)
	{
		W= S.nextInt();
		H= S.nextInt();
		if (W<L || H<L)
		{
			System.out.println("UPLOAD ANOTHER");
		}
		else 
		{
			if(W==H)
			{
				System.out.println("ACCEPTED");
			}
			else
			{
				System.out.println("CROP IT");
			}
		}
		
		N--;
	      }
		}

	}
