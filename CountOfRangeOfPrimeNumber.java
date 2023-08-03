import java.util.Scanner;
class CountOfRangeOfPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("enter starting number");
		int start=sc.nextInt();
		

		System.out.println("enter ending number");
		int end=sc.nextInt();

		int count =0;
		for (int i=start;i<=end ;i++ )//1<10 
		{
			int j;
			   
			for (j=2;j<i;j++)//2<1
			{
				
				if (i%j==0)
				{
					break;
				}			
			}

			if (i==j)
			{				 
				System.out.println(i);
				count++;
			}				
		}
		System.out.println("count of prime numbers in given range : "+count);
	}
}
