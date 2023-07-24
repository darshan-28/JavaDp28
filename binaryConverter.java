import java.util.Scanner;
class binaryConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter decimal value");
		int ip = sc.nextInt();
		decimalToBinary(ip);
	}

	public static void decimalToBinary(int num)
	{
		String res="";
		while (num>=1)
		{
			res = (num%2)+res;
			num/=2;
		}
		System.out.println(res);
	}
}
