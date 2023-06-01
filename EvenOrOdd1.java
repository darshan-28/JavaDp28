//design a method which excepts a number and returns wheather it is odd or evven

import java.util.Scanner;
class EvenOrOdd1
{
	public static int EvenOrOdd(int num)
		{
			if (num%2==0)
			{
				System.out.println("It is an Even Number= "+num);
			}
			else
				{
					System.out.println("It is an Odd Number= "+num);
				}
			return num;
		}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
        int num = sc.nextInt();
		EvenOrOdd(num);
	}
}
