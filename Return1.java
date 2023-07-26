import java.util.Scanner;
class Return1
{
	public static void main(String[] args) 
	{
		System.out.println("enter to Numbers");

		Scanner sc = new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		//addToNumber(a,b);
		System.out.println("additon of "+a+" and "+b+" is : "+addToNumber(a,b));

	}
	public static int addToNumber(int a,int b)
	{
		int res = a+b;

		return res;
	}
}
