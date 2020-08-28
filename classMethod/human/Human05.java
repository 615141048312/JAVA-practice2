package classMethod.human;

public class Human05 {
	private String name;
	private int age;
	
	public Human05() {
		name = "山田";
		age = 20;
	}
	// ここから追加
	public Human05(String name, int age) {
		this.name  = name;
		this.age = age;
	}
	// ここまで
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
