import java.util.Scanner;
class SquareRoot 
{
	public static void main(String[] args) 
	{	
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		double num = sc.nextDouble();
		for (double i=1;i*i<num ;i++ )
		{
		
			if (i*i==num)
			{
				System.out.println("square root of "+num +" is:");				
			}
			else
			{
			 	double diff1 = (i*i)-num;
                double diff2 = num-((i-1)*(i-1));
                double small = diff1<diff2?diff1:diff2;
                double res = 0;

				if (small==diff1)
				{
					res =i-(small/(2*i));
				}
				else if (small==diff2)
				{
					i--;
					res=i+(small/(2*i));
				}
				 
				System.out.println("square root of "+num+" is :"+res);
				break;
			}

		}
	}
}
