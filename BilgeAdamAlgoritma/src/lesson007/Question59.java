package lesson007;

public class Question59 {

	private static int[] tekSayilariBulma(int[][] array) {
		int[] tekSayilarArrayi = new int[(array.length) * (array[0].length)];
		int tekSayilarKacTane = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 2 != 0) {
					tekSayilarArrayi[tekSayilarKacTane] = array[i][j];
					tekSayilarKacTane++;
				}
			}
		}
		return tekSayilarArrayi;

	}

	private static void arrayiYazdirma(int[] array2) {
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] != 0) {
				System.out.println(array2[i]);
			}
		}

	}

	public static void main(String[] args) {
		// 1. metod: parametre olarak array alacak. aldığı dizideki tek elemanları
		// farklı bir diziye atacak
		// 2. metod: tek sayıların olduğu diziyi ekrana yazdıracak

		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 } };

		int[] matristeBulunanTekSayilar = tekSayilariBulma(matris);
		arrayiYazdirma(matristeBulunanTekSayilar);

	}

}
