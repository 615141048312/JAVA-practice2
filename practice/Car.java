package practice;

public class Car {
	private double fuelCost;
	private double fuelAmount;
	private double fuelLevel;
	
	// コンストラクタを作成
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	// moveメソッド
	public void move(int mileage) {
		System.out.println(mileage + "km 走ります");
		fuelLevel = fuelAmount - (mileage / fuelCost);
	}
	
	public double getFuelAmount() {
		return fuelLevel;
	}
}

// 残量　＝　元の量　ー　20/12.5
