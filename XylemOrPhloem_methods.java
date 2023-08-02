import java.util.Scanner;
class XylemOrPhloem_methods
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");
		int ip = sc.nextInt();
		if (xylemOrPhloem(ip))
		{
			System.out.println("its a Xylem number");
		}
		else
		{
			System.out.println("its a Phloem number");
		}
	}
	public static boolean xylemOrPhloem(int num)
	{
		int middleDigit = 0;
		int firstAndLastD = 0;
		firstAndLastD = firstAndLastD + num%10;
		num/=10;
		while (num>9)
		{
			middleDigit = middleDigit + num%10;
			num = num/10;
		}
		firstAndLastD = num + firstAndLastD;
		
		if (firstAndLastD==middleDigit)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
