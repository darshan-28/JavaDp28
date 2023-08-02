import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number");
		int ip = sc.nextInt();
		if (sum(ip)==product(ip))
		{
			System.out.println("its a Spy Number : "+ip);
		}
		else
		{
			System.out.println("its not a Spy Number : "+ip);
		}
	}
	public static int sum(int num)
	{
		int sum=0;
		while (num>0)
		{
			sum =sum+num%10;
			num/=10;
			
		}
		return sum;
	}
	public static int product(int num)
	{
		int pro=1;
		while (num>0)
		{
		    pro =pro*num%10;
			num/=10;
			
		}
		return pro;
	}


}
