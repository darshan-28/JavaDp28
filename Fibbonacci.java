import java.util.Scanner;
class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int a=1;
		int b=2;

		if (num==1)
			
		{
			System.out.println(a+" ");

		}
		else if (num==2)
		{
			System.out.println(a+" "+b);
		}
		for(int i=3; i<=num; i++)
		{
			int c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}

	}
}
