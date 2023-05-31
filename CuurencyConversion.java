class CuurencyConversion1
{
	public static void main(String[] args) 
	{
		//toDoller(50);
		//toDirham(50);
		toEuro(50);
	}
	public static void toDoller(double rupee)
		{
			double doller = rupee*0.012;
			System.out.println(doller);
		}
	public static void toDirham(double doller)
		{
			double dirham = doller/3.67;
			System.out.println(dirham);
		}
	public static void toEuro(double dirham)
		{
		    double euro = dirham/3.93;
			System.out.println(euro);			
		}
}
