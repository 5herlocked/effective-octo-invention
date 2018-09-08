public class GasTank {
	private double amount = 0d, capacity;

	public GasTank (double capacity){
		this.capacity = capacity;
	}

	public void addGas (double amount){
		this.amount = ((this.amount+amount) >= capacity) ? capacity : this.amount+amount;
	}

	public void useGas (double amount){
		this.amount = ((this.amount-amount) < 0) ? 0 : this.amount-amount;
	}

	public boolean isEmpty () { return amount < 0.1; }

	public boolean isFull () { return amount > capacity-0.1; }

	public double getGasLevel () { return amount; }

	public double fillUp () {
		double temp = amount;
		amount = capacity;

		return Math.abs(capacity - temp);
	}
}