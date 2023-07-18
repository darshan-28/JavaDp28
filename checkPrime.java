import java.util.Scanner;
class checkPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int i;

		for (  i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				break;
			}
			
		}
		if (  i==num)
		{
			System.out.println("it a prime number");
		}
		else
		{
			System.out.println("it not a prime number");
		}
	}
}
