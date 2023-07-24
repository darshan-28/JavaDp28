import java.util.Scanner;
class rupeeConversion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter amount");
		double rupee = sc.nextDouble();
		ruppeToDollar(rupee);
	}

	public static void ruppeToDollar(double rupee)
	{
		double dollar = rupee/81.81;
		//System.out.println("ruppeToDollar: "+dollar);
		twoDecimalPoint(dollar);
		dollarToDirham(dollar);
		
	}

	public static void dollarToDirham(double dollar)
	{
		double Dirham = dollar*3.67;
		//System.out.println("dollarToDirham: "+Dirham);
		twoDecimalPoint(Dirham);
		dirhamToEuro(Dirham);
		
	}

	public static void dirhamToEuro(double dirham)
	{
		double euro = dirham/4.07;
		//System.out.println("dirhamToEuro: "+euro);
		twoDecimalPoint(euro);
		euroToDong(euro);
		
	}

	public static void euroToDong(double euro)
	{
		double dong = euro*26243.92;
		twoDecimalPoint(dong);
		//System.out.println("euroToDong: "+dong);
	}

	public static void twoDecimalPoint(double ip)
	{
		int temp =(int)(ip*100.0);
		double res = temp/100.0;
		System.out.println(res);
	}
}
