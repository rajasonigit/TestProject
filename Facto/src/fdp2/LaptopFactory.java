package fdp2;

public class LaptopFactory {
	public Laptop getNewLaptop(String str)
	{
		if(str.equals("Secure"))
			return new Apple();
		else if(str.equals("Ordered"))
			return new Dell();
		else if(str.equals("Unused"))
			return new Hp();
		else
			return new Hp();
	}
}
