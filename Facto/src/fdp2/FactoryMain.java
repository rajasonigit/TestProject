package fdp2;

public class FactoryMain {

	public static void main(String[] args) {	
		LaptopFactory aLF = new LaptopFactory();
		Laptop aLaptop = aLF.getNewLaptop("sdsdf");
		aLaptop.laptopSpec();
	}
}