import maxia.Factorial;
import maxia.FactorialIMPL;

public class Fcto {
	public static void main(String[] args) {
		Factorial g = new FactorialIMPL();
		
		String a = g.getFactorial(9);
		
		System.out.println("Factirial is = "+ a);
//		
//		Factorial f = new FactorialIMPL();
//		String r = f.getFactorial(3);
//		System.out.println(r);
	}
}