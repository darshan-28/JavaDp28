//design a method which excepts a number and returns wheather it is Palindrome or Not ,also if it is Palindrome 
//check wheather it is Even Palindrome  Or Odd Palindrome 

//Note:  A palindrome number is a number that is same after reverse.

import java.util.Scanner;
class checkEvenPalindrome
{
	public static int reverse(int num)
		{
		    int reverse=0;
			while (num!=0)
			{
				reverse =reverse*10+(num%10);
				num=num/10;
			}
		return reverse;	
		}
	public static boolean checkPalindrome(int num)
	{
		if (num==reverse(num))
		{
			return true;
		}
		return false;
	}

	public static boolean checkEvenOdd(int num)
	{
		if (num%2==0)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
        int ip = sc.nextInt();

		if (checkPalindrome(ip))
		{
			if (checkEvenOdd(ip))
			{
				System.out.println("Even Palindrome");
			}
		else
			{
				System.out.println("Odd Palindrome");	
			}  
		}else{
			System.out.println("Not a Palindrome");	    
		}

	}
}
