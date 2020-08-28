package practice;

public class Car {
	private double fuelCost;
	private double fuelAmount;
	// 模範解答では使わない
	private double fuelLevel;
	
	// コンストラクタを作成
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	// moveメソッド
	public void move(int mileage) {
		System.out.println(mileage + "km 走ります");
		// 模範解答 this.fuelAmount -= (km / fuelCost);
		fuelLevel = fuelAmount - (mileage / fuelCost); 
	}
	
	public double getFuelAmount() {
		// 模範解答 return this.fuelAmount;
		return fuelLevel;
	}
}
