//import java.util.Scanner;
class RecPower 
{
	public static void main(String[] args) 
	{
		System.out.println(power(10,10));
	}
	public static int power( int base, int raise)
	{
		if (raise==0)
		{
			return 1;
		}
		return base*power(base,raise-1);
	}
}
