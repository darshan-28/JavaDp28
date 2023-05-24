import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum=0;
		int pro=1;

		while (num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			pro=pro+rem;
			num=num/10;
		}
		if (sum==pro)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("not A Spy Number");

		}

	}
}
