import java.util.Scanner;
class LCM
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a numbers to find LCM");

		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		int large=n1>n2?n1:n2;

        boolean a=true;
		while (a)
		{
			if (large%n1==0&&large%n2==0)
			{
				System.out.println("the LCM is : "+large);
				break;
			}
			large++;

		}
	}
}
