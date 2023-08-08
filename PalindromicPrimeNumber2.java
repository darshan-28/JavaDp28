import java.util.Scanner;
class PalindromicPrimeNumber2
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int ip = sc.nextInt();
		if(checkPrime(ip))
		{
			if(checkPalindrome(ip))
			{
				System.out.println("PalindromicPrimeNumber number");
			}
		}
		else
		{
			System.out.println("not a Prime number");
		}		 
					 	
	}

	public static boolean checkPalindrome(int num)
	{	int i ;	 
		int rev = 0;
		for (  i = num;i!=0 ; )
		{
			rev=(rev*10)+(i%10);
			i/=10;
		}
		if (rev==num)
		{
			return true;
		}
		return false;
	}

	public static boolean checkPrime(int num)
	{		 
		int i;
		for ( i = 2;i<num ;i++ )
		{
			if (num%i==0)
			{
				return false;
			}			
		}
		return true;
	}

}
