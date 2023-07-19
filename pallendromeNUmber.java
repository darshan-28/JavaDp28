import java.util.Scanner;
class pallendromeNUmber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a Number");
		int r,sum=0;    
  int n=sc.nextInt();
  
  int temp=n;    
  while(n>0){    
   r=n%10; 
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("It is a palindrome number ");    
  else    
   System.out.println("It is not a palindrome number");    
}  
}  
