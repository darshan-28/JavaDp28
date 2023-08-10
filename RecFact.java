import java.util.Scanner;
class RecFact
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Number");
		int ip = sc.nextInt();
		System.out.println("1= "+factorial(ip));
	}

	public static int factorial(int num)
	{
		if (num==1)
		{
			return 1;
		}
		System.out.print(num+"*");
		System.out.print(" ");
		return num*factorial(num-1);
	}
}
	 

