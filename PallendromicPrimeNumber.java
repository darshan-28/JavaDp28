// given Number is Pallendromic Prime Number or Not

import java.util.Scanner;
class PallendromicPrimeNumber
{
	public static void main(String[] args) 
	{
		System.out.println("enter the Number");
		Scanner sc = new Scanner(System.in);

		int ip=sc.nextInt();
		if (checkPallendrome(ip))
		{
			if (checkPrime(ip))
			{
				System.out.println("Number is Palindrome and Prime");
			}
			else
			{
				System.out.println("Number is Palindrome but Not Prime");
			}
		}
		else
		{
			System.out.println("Number is Not Palindrome");
		}
	}

	public static boolean checkPallendrome(int num)
	{
		int rev=0;

		for (int i=num;i!=0;i/=10 )
		{
			rev=(rev*10)+(i%10);
		}
			if (rev==num)
			{
				return true;
			}
			else
		    {
			return false;
		    }
	}

	public static boolean checkPrime(int num)
	{
		for (int i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
