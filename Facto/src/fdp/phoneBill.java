package fdp;

public class phoneBill {

	public static void main(String[] args) {
		SelectNetworkFactory a =new SelectNetworkFactory();
		cellularPlan cp1 = a.getPlan(null);
		cp1.getRate();
		}
}