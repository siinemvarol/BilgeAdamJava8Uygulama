package lesson008;

import java.util.Scanner;

public class Question60 {

	private static int yasHesapla(int dogumYili) {
		int yas = 2023 - dogumYili;
		return yas;

	}

	private static int yuzyilHesapla(int dogumYili) {
		int yuzyil = 0;
		yuzyil = dogumYili / 100 + 1;
		return yuzyil;

	}

	private static void bilgileriYazdir() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Doğum yılınızı girin: ");
		int girilenDogumYili = scanner.nextInt();
		int hesaplanmisYas = yasHesapla(girilenDogumYili);
		int hesaplanmisYuzyil = yuzyilHesapla(girilenDogumYili);
		System.out.println("Doğum yılı girilen kişinin yaşı: " + hesaplanmisYas);
		System.out.println("Doğum yılı hangi yüzyılda: " + hesaplanmisYuzyil);

	}

	public static void main(String[] args) {
		// Doğum yılınızı girerek yaşınızı ve hangi yüzyılda olduğunu hesaplayan
		// metodları yazınız
		// 3 farklı metod olacak:
		// yasHesapla
		// yuzyilHesapla
		// bilgileriYazdir

		bilgileriYazdir();

	}

}
