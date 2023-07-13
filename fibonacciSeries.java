import java.util.Scanner;
class fibonacciSeries
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number of Fibonacci Number");

		int count=sc.nextInt();
		int n1=0, n2=1, n3;
		for (int i=0;i<count;i++)
		{
			System.out.println("fibonacci number: "+n1);
			n3=n1+n2;
			//System.out.println(n1);
			n1=n2;
			n2=n3;
		}
	}
}
