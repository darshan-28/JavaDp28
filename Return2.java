import java.util.Scanner;
class Return2
{
	public static void main(String[] args) 
	{
		System.out.println("enter the Number");
		Scanner sc = new Scanner(System.in);

		int ip=sc.nextInt();

		int sum =sumOfDigits(ip);
		boolean res =checkOddEven(sum);

		if (res)
		{
			System.out.println("Sum of Digits Of given Number is Even");
		}
		else 
		{
		System.out.println("Sum of Digits Of given Number is odd");
	    }

	}
	public static int sumOfDigits(int num)
	{
		int sum=0;
		while (num!=0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}

	public static boolean checkOddEven(int num)
	{
		if (num%2==0)
		{
			return true;
		}
		return false;
	}
}
