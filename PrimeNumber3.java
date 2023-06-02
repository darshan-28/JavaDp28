import java.util.Scanner;
class PrimeNumber 
{
	public static boolean isSolution(int a)
	{
		for (int i=2;i<a/2 ;i++ )
		{
			if (a%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting point");
		int start = sc.nextInt();
		System.out.println("enter ending point");
		int end   = sc.nextInt();


		for (;start<=end ;start++ )
		{
			if (isSolution(start))
			{
				System.out.println(start+" = "+"prime number");
			}
		}
		
	}
}
