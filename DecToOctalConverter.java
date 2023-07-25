import java.util.Scanner;
class DecToOctalConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int ip = sc.nextInt();
		DecToOct(ip);		 
	}

	public static void DecToOct(int num)
	{
		System.out.print("the conversionn of "+num);
		String ans ="";
		while (num>1)
		{
			ans =(num%8)+ans; 
	     	num/=8;		 
		}			
			System.out.println(" from decimal to Octal is "+ans);
		}		
	}

