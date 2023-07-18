import java.util.Scanner;
class powerOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int base = sc.nextInt();
        System.out.println("enter the raise value");
		int raise = sc.nextInt();

        int ans=1;
		for (int i=0;i<raise ;i++ )
		{ 
			ans*=base;			
		}
		System.out.println("the power of "+base+" raised to the "+ans);

		 
	}
}
