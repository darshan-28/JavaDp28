import java.util.Scanner;
class RangeOfPrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Staring Number");
		int start = sc.nextInt();
		System.out.println("Ending Number");
		int end   = sc.nextInt();
		for (int i=start;i<end ;i++ )
		{
			if (isPrime(i))
			{
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int num)
	{
		int i;
		for (i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
