//A neon number is a number where the sum of digits of the square of the number is equal to the number. 
//Let's take an example. n = 9. square = 81. sum of digits of square = 8 + 1 = 9.


import java.util.Scanner;
class NeonNumber_methods
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");
		int ip = sc.nextInt();

		if (ip==sumOfSquareOfDigits(ip))
		{
			System.out.println("its a Neon Number :" +ip+);
		}
		else
		{
			System.out.println("its not a Neon Number :" +ip);
		}
		 
	}
	public static int sumOfSquareOfDigits(int num)
	{
		int sum=0;
		int sqr = num*num;
		while (sqr>0)
		{
		    sum = sum+sqr%10;
			sqr =sqr/10;
		}
		return sum;
	}
}
