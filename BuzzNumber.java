import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");

		int num=sc.nextInt();
		if (num%10==7||num%7==0)
		{
			System.out.println("Its a Buzz number");
			System.exit(5);
		}
		System.out.println("Its not a number");
	}
}
