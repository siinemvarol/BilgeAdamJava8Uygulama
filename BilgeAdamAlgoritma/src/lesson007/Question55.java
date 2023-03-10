package lesson007;

import java.util.Iterator;

public class Question55 {

	public static void main(String[] args) {
		// Verilen arrayde en büyük ve en küçük değerleri bulalım

		String[] array = { "5", "2", "3", "4", "99", "85" };

		int[] integerArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			integerArray[i] = Integer.parseInt(array[i]);  // parseInt: primitive int döndürüyor
		}													// valueOf : nesne(obje) döndürüuor			

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < integerArray.length; i++) {
			if (integerArray[i] > max) {
				max = integerArray[i];
			}
			if (integerArray[i] < min) {
				min = integerArray[i];
			}
		}

		System.out.println("Max: " + max);
		System.out.println("Min: " + min);

	}

}
