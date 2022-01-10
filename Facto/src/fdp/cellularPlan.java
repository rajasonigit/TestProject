package fdp;

public abstract class cellularPlan {
	protected double rate;
	abstract void getRate();
	public void processBill(int minutes) {
		System.out.println(minutes*rate);
	}
}
