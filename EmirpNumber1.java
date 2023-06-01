//A number is called an emirp number if we get another prime number on reversing the number itself. 
//In other words, an emirp number is a number that is prime forwards or backward. It is also known as twisted prime numbers.

import java.util.Scanner;
class EmirpNumber1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		int c1=0;
		int c2=0;

		while (num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		num=temp;
		int big =num>rev?num:rev;

		for (int i=1;i<=big ;i++ )
		{
		 
		if (num%i==0)
			c1++;
		if (rev%i==0)
			c2++;
		if (c1==c2)
		{
			System.out.println("it's An Emirp Number");
			break;
		}else
			{
				System.out.println("Not an Emirp Number");
				break;
			}

		}
		 
	}
}
