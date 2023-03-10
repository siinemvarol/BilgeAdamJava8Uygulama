package lesson005;

import java.util.Arrays;
import java.util.Scanner;

public class HW001 {

	public static void main(String[] args) {

		// 1
		// Question 43 için: hangi sayıları saydrmak istiyorsak kullanıcıdan alalım

		int[] array1 = { 1, 3, 4, 4, 4, 4, 2, 2, 9, 8, 8 };

		Scanner scanner = new Scanner(System.in);
		System.out.println(Arrays.toString(array1));
		System.out.println("Yukarıdaki arrayde hangi sayıları saymak istiyorsunuz? (birinci sayıyı girin)");
		int firstNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Yukarıdaki arrayde hangi sayıları saymak istiyorsunuz? (ikinci sayıyı girin)");
		int secondNumber = scanner.nextInt();
		scanner.nextLine();

		int counterForFirstNumber = 0;
		int counterForSecondNumber = 0;

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == firstNumber) {
				counterForFirstNumber++;
			} else if (array1[i] == secondNumber) {
				counterForSecondNumber++;
			}
		}
		if (counterForFirstNumber > counterForSecondNumber) {
			System.out.println("Dizide " + firstNumber + " sayısı " + secondNumber + " sayısından daha fazladır. "
					+ counterForFirstNumber + " kere geçmektedir.");
		} else if (counterForSecondNumber > counterForFirstNumber) {
			System.out.println("Dizide " + secondNumber + " sayısı " + firstNumber + " sayısından daha fazladır. "
					+ counterForSecondNumber + " kere geçmektedir.");
		} else {
			System.out.println("Dizide " + firstNumber + " sayısı ve " + secondNumber
					+ " sayısı eşit sayıda geçmektedir. " + counterForSecondNumber + " kere geçmektedir.");
		}

		// 2
		// Bir dizide en büyük ikinci sayıyı bulan program

		int[] array2 = { 1, 3, 4, 4, 4, 4, 2, 2, 25, 9, 8, 8, 13, 18, 17, 21 };

		int enBuyuk1 = 0;
		int enBuyuk2 = 0;

		for (int i = 0; i < array2.length; i++) {
			if (array2[i] > enBuyuk1) {
				enBuyuk2 = enBuyuk1;
				enBuyuk1 = array2[i];
			} else if ((array2[i] != enBuyuk1) && (array2[i] > enBuyuk2)) {
				enBuyuk2 = array2[i];
			}
		}
		System.out.println("Arraydeki en büyük sayı: " + enBuyuk1);
		System.out.println("Arraydeki en büyük ikinci sayı: " + enBuyuk2);

		// 3
		// Bir dizide eğer 13 var ise hem 13'ü hem de bir sonraki indexi toplama
		// işlemine almayacak
		// Dizideki elemanların toplamını bulalım
		// int nums2[] = { 1, 13, 5, 13, 2, 5, 7, 1 };
		// 1 + 5 + 7 +1
		// toplam --> 1 + 5 = 6

		int array3[] = { 1, 13, 5, 13, 2, 5, 7, 1, 13, 13, 8, 13, 9, 13 };

		int sum = 0;

		for (int i = 0; i < array3.length; i++) {
			if (i != array3.length - 1) {
				if (array3[i] == 13) {
					if (array3[i + 1] == 13) {
						i = i + 2;
					} else if (array3[i + 1] != 13) {
						i = i + 1;
					}

				} else {
					sum = sum + array3[i];
					System.out.println("eklenen " + array3[i]);
				}
			}

		}
		System.out.println("sayıların toplamı: " + sum);
	}

}
