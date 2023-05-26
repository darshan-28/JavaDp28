import java.util.Scanner;
class BouncyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number to check if it is Bouncy number or not");                                                    
		int num = sc.nextInt();
		boolean pos = false;
		boolean neg = false;

		while (num>9)
		{
			int rem1=num%10;
			rem1=num/10;
			int rem2=num%10;

			if (rem1>rem2)
			{
				pos=true;
			}
			if (rem2>rem1)
			{
				neg=true;
			}
			if (pos&&neg)
			{
				System.out.println("oh! it's A Bouncy Number");
                System.exit(2);
			}
		}		
		System.out.println("oh! Not A Bouncy Number");
	}
}
