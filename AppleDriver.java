class AppleDriver 
{
	public static void main(String[] args) 
	{
		Apple a1 = new Apple();

		a1.place = "Shimla";
		a1.color = "red";
		a1.price = 100;

		a1.showPlace().showPrice().showColor();
	}
}