import java.util.Scanner;
class HCF 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a numbers to find HCF");

		int n1=sc.nextInt();
		int n2=sc.nextInt();		
		int smallest=n1<n2?n1:n2;

        boolean a=true;
		while (a)
		{
			if(n1%smallest%n1==0 && n2%smallest==0)
			{
				System.out.println("the HCF is : "+smallest);
				break;
			}
			--smallest;
		}
	}
}
