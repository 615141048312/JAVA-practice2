package classMethod;

import classMethod.human.Human05;

public class ClassMethod05 {
	public static void main(String[] args) {
		Human05 yamada = new Human05();
		// ここから追加
		Human05 sato = new Human05("佐藤", 25);
		// ここまで
		
		System.out.println("名前は" + yamada.getName() + "で、年齢は" + yamada.getAge() + "です。");
		// ここから追加
		System.out.println("名前は" + sato.getName() + "で、年齢は" + sato.getAge() + "です。");
		// ここまで
	}
}
