package lesson012;

import java.util.Scanner;

public class Main {

	// pizza sipariş uygulaması
	// pizza classında attribute -> price; vejeteryan mı normal mi;
	// eğer vejeteryan pizzaysa fiyat 300 tl, normal pizza ise fiyat 200 tl

	// Mainde 1 pizza oluşturalım

	// 4 tane metod yazalım
	// sos ekle --> price'a 50 tl ekle
	// peynir ekle --> price'a 100 tl ekle
	// eve sipariş ver --> 20 tl kurye parası alalım
	// fiş al --> bize pizza'nın total price'ını verecek

	public static void main(String[] args) {

		Pizza pizza1 = new Pizza(true);
		Pizza pizza2 = new Pizza(false);

		System.out.println(pizza1.isVegie());
		System.out.println(pizza2.isVegie());

		System.out.println(pizza1.toString());
		System.out.println(pizza2.toString());

		System.out.println("Pizza1 fiyatı: " + pizza1.getPrice());
		pizza1.sosEkle();
		pizza1.sosEkle();
		pizza1.sosEkle();
		System.out.println(pizza1.getPrice());
		pizza1.peynirEkle();
		pizza1.peynirEkle();
		pizza1.fisAl();
		pizza1.eveSiparisVer();
		System.out.println(pizza1.getPrice());
		pizza1.fisAl();

		menu();
	}

	// kullanıcıdan vegi mi normal mi alalım
	// menü çıkaralım karşısına
	// 1- sos ekle
	// 2- peynir ekle
	// 3- fiyatı görüntüle
	// 4 - sos çıkar
	// 5 - peyniri çıkar

	public static void menu() {
		Pizza pizza2 = null;
		boolean cikis = true;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Pizzanızı belirtin: ");
		boolean isVegi = true;
		// vegi
		// normal
		String pizzaTercihi = scanner.nextLine();
		if (pizzaTercihi.equals("vegi")) {
			pizza2 = new Pizza(isVegi);
		} else if (pizzaTercihi.equals("normal")) {
			isVegi = false;
			pizza2 = new Pizza(isVegi);
		} else {
			System.out.println("böyle bir pizza bulunmamaktadır..");
		}

		int sosSayac = 0;
		int peynirSayac = 0;
		while (cikis) {
			System.out.println("seçim yapınız");
			System.out.println("--- menu ---");
			System.out.println("1 - sos ekle");
			System.out.println("2 - peynir ekle");
			System.out.println("3 - peynir çıkar ");
			System.out.println("4 - sos çıkar");
			System.out.println("5 - fişi görüntüle");

			int secim = scanner.nextInt();

			switch (secim) {
			case 1:
				pizza2.sosEkle();
				sosSayac++;
				break;
			case 2:
				pizza2.peynirEkle();
				peynirSayac++;
				break;
			case 3:
				if (peynirSayac > 0) {
					pizza2.peynirCikar();
					peynirSayac--;
				} else {
					System.out.println("peynir eklenmemiş");
				}
				break;
			case 4:
				if (sosSayac > 0) {
					pizza2.sosCikar();
					sosSayac--;
				}

				break;

			case 5:
				pizza2.fisAl();
				System.exit(0);
				cikis = false;
				break;

			default:
				System.out.println("lütfen 1-3 arası sayı girin");
				break;
			}
		}
	}

}
