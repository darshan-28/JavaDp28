class EvenOdd
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		int ip = 5;
		boolean ans =checkEvenOdd(ip);
		System.out.println(ip);
		System.out.println(ans);
		
	}

	public static boolean checkEvenOdd(int num)
	{
		if (num%2==0)
		{
			return true;
		}
		return false;
	}
}
