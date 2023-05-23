import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to check if it is Buzz number or not");
		int num = sc.nextInt();

		if (num%10==7||num%7==0)
		{
			System.out.println("yay! buzz number");
			System.exit(5);
		}
		System.out.println("oh! Not A Buzz Number");
	}
}
