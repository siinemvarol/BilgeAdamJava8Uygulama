package lesson008;

import java.util.Random;
import java.util.Scanner;

public class Question65 {
	// randomSayiUret metodunda 1'den 500'e kadar random sayı üretelim
	// ortalamaHesapla metodu yazalım

	// kullanıcıdan kaç tane sayıyla işlem yapmak istediğini soralım
	// girdiği veriye göre içerde bir array oluşturalım ve random üretilen sayıları
	// bu arraye atalım. sonra ortalamasını yazdıralım

	public static void main(String[] args) {

		int[] array = randomSayiUret(); 							// randomSayiUret(); --> kodu ilk böyle yazdım ve çalışmadı. ortalamaHesapla()
																	// içine atabileceğim bir array değeri yoktu
		System.out.println("ortalama: " + ortalamaHesapla(array)); 	// ortalamaHesapla(); -- >> bu sebeple önce burada
																	// ilk metodla bir array
																	// oluşturdum, sonra ikinci metoda arrayi attım
	}

	private static double ortalamaHesapla(int[] array) {
		int toplam = 0;
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			toplam += array[i];
			counter++;
		}
		int ortalama = toplam / counter;
		return ortalama;

	}

	private static int[] randomSayiUret() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaç adet random sayı üretmek istiyorsunuz: ");
		int arrayBoyutu = scanner.nextInt();
		int[] randomSayilar = new int[arrayBoyutu];
		Random random = new Random();
		for (int i = 0; i < randomSayilar.length; i++) {
			randomSayilar[i] = random.nextInt(1, 500);
			System.out.println(randomSayilar[i]);
		}
		return randomSayilar;
	}

}
