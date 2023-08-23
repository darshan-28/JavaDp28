class Marker
{
	 String brand = "camlin";
	 double price;
	 String color;
	{
		System.out.println("from non - static block");
	}
	Marker()
	{
		System.out.println("from constructor of marker");
	}

	public void displayMarker()
	{
		String color = "White";
		System.out.println(brand);
		System.out.println(price);
		System.out.println(color);
		System.out.println(this.brand);
	}
}
