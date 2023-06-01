//design a method which excepts a number and returns wheather it is Palindrome or Not ,also if it is Palindrome 
//check wheather it is Even Palindrome  Or Odd Palindrome 

//Note:  A palindrome number is a number that is same after reverse.

import java.util.Scanner;
class EvenPalindromeOrOddPalindrome1
{
	public static int PallendromeOrNot(int a)
	{
		int rem=0;
		int sum=0;
		int temp=a;

		while(a>0)
		{
			rem=a%10;
			sum=(sum*10)+rem;
			a=a/10;
		}
		if (sum==temp)
		{
			System.out.println("Pallendrome");
		}
		else
		{
			System.out.println("Not a Pallendrome");
		}
		 
		return a;		
	}
	public static int EvenOrOdd(int num)
		{
			if (num%2==0)
			{
				System.out.println("It is an Even Palindrome Number = "+num);
			}
			else
				{
					System.out.println("It is an Odd Palindrome Number = "+num);
				}
			return num;
		}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
        int a = sc.nextInt();
		int num=a;
		PallendromeOrNot(a);
		EvenOrOdd(num);
		 
	}
}
