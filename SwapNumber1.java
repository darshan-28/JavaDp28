import java.util.Scanner;
class SwapNumber
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter Numbrer For a");
		int a = sc.nextInt();//6
		System.out.println("Enter Numbrer For b");
		int b = sc.nextInt();//6
		int temp=a;//5
		a=b;//6
		b=temp;

		System.out.println("number in var a : "+a);
		System.out.println("number in var b : "+b);
		
	
		// boolean a;
		//a=true;
		//System.out.println(a);  //CTE
		//-->
	
}
}