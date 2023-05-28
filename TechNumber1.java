import java.util.Scanner;
class TechNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt(); //2025
		int temp=num;
		int count=0;
		int rev1=0;
		int rev2=0;

		while (num>0)
		{
			count++;
			num=num/10;
		}
		count=count/2;
		num=temp;
		for (int i=1;i<=count ;i++ )
		{
			rev1=(rev1*10)+num%10;
			num=num/10;

		}
		for (int i=1;i<=rev1 ;i++ )
		{
			rev2=(rev2*10)+rev1%10;
			rev1=rev1/10;
		}
		int sum=num+rev2;
		if (sum*sum==temp)
		{
			System.out.println("tech Number!");
		}
		else
		{
			System.out.println("it's Not a tech Number!");
		}
		//System.out.println("Hello World!");
	}
}
