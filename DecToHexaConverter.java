import java.util.Scanner;
class DecToHexaConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int ip = sc.nextInt();
		DecToHexa(ip);		 
	}
	public static void DecToHexa(int num)
	{
		System.out.print("the conversionn of "+num);
		String ans ="";
		while (num>0)
		{
			int rem =num%16;

			if (rem>9&& rem<16)
			{
				if (rem==10)
				{
					ans="A"+ans;
				}
				else if (rem==11)
				{
					ans ="B"+ans;
				}
				else if (rem==12)
				{
					ans = "C"+ans;
				}
				else if (rem==13)
				{
					ans = "D"+ans;
				}
				else if (rem==14)
				{
					ans = "E"+ans;
				}
				else if (rem==15)
				{
					ans = "F"+ans;
				}
			}
			else
			{
				ans =rem+ans;
			}
			num/=16;
		}
		System.out.println(" from decimal to HexaDecimal is "+ans);
	}
}
