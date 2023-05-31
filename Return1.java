import java.util.Scanner;
class Return1
{
	public static int returnBigValue(int v1,int v2)
		{
			 int big=v1>v2?v1:v2;
			 return big;
		}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);

		System.out.println("Enter Two Values");
		int v1=sc.nextInt();
		int v2=sc.nextInt();

		int ans=returnBigValue(v1,v2);
		System.out.println("The Big Value Among Entered Two Values is : "+ans);
	}
	 
}
