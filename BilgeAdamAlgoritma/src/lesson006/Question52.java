package lesson006;

public class Question52 {

	public static void main(String[] args) {
		// verilen 2 arrayde ortak olan sayıları bulup yazdıralım
		int array1[] = { 50, 60, 3, 4, 3, 9, 8, 7, 45, 95 };
		int array2[] = { 1, 2, 50, 60, 3, 8, 9, 7, 88, 95 };

		int ortakSayilar[] = new int[array1.length];
		int counter = 0;
		boolean arraydeVarMi = false;

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					for (int k = 0; k < ortakSayilar.length; k++) {
						arraydeVarMi = false;
						if (array1[i] == ortakSayilar[k]) {
							arraydeVarMi = true;
							break;
						} else {
							arraydeVarMi = false;

						}

					}
					if (arraydeVarMi == false) {
						ortakSayilar[counter] = array1[i];
						counter++;
						System.out.println(array1[i] + " sayısı iki arrayde de vardır.");
						break;
					}

				}
			}

		}
		System.out.println("-----------");
		for (int i = 0; i < ortakSayilar.length; i++) {
			System.out.println(ortakSayilar[i]);
		}
	}

}
