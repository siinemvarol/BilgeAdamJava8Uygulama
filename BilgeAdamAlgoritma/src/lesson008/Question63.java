package lesson008;

public class Question63 {
	// parametre olarak 2 tane array alan ve aldığı arrayleri
	// toplayıp farklı bir arrayin içine saklayan metod
	// toplamları yazdıracağız

	private static void arrayleriTopla(int[] array1, int[] array2) {
		int[] toplamArrayi = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			toplamArrayi[i] = array1[i] + array2[i];
		}
		for (int i = 0; i < toplamArrayi.length; i++) {
			System.out.println(toplamArrayi[i]);
		}

	}

	public static int[] arrayToplam2(int[] array1, int[] array2) {
		int[] toplam = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			toplam[i] = array1[i] + array2[i];
		}
		return toplam;
	}

	public static void ekranaYazdirma(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");

		}
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = { 1, 2, 3, 4, 5, 6 };

		arrayleriTopla(array1, array2);

		System.out.println("\n--2.alternatif----\n");

		arrayToplam2(array1, array2);
		for (int i = 0; i < array2.length; i++) {
			System.out.print(arrayToplam2(array1, array2)[i] + " ");
		}

		System.out.println("\n----------\n");
		// ya da aşağıdaki gibi yapabiliriz. yukarıdaki tavsiye edilmiyor
		int[] toplamArrayiYazdirma = arrayToplam2(array1, array2);
		for (int i = 0; i < toplamArrayiYazdirma.length; i++) {
			System.out.print(toplamArrayiYazdirma[i] + " ");
		}
		
		System.out.println("\n----------\n");
		
		ekranaYazdirma(toplamArrayiYazdirma);

	}

}
