
public class Chapter08 {
	public static void main(String[] args) {
		int number1 = 1;
		while (number1 < 5) {
			System.out.println(number1 * number1);
			number1++;
		}
		
		int[] array1 = { 1, 2, 3, 4 };
		for (int count = 0; count < array1.length; count++) {
			System.out.println(array1[count]);
		}
		
		for (int element : array1) {
			if (element % 2 == 0) {
				continue;
			}
			System.out.println(element);
		}
	}
}
