package lesson009;

import java.util.Scanner;

public class Menu {
	public static Scanner scanner = new Scanner (System.in);
	
	public static void menuyuGoster() {
		boolean kontrol = true;
		while (kontrol) {
			System.out.println("------Menü------");
			System.out.println("1-Toplama işlemi");
			System.out.println("2-Çıkarma işlemi");
			System.out.println("3-Bölme işlemi");
			System.out.println("4-Üs alma işlemi");
			System.out.println("Seçiminiz: ");
//			Scanner scanner = new Scanner(System.in);
			int secim = scanner.nextInt();
			scanner.nextLine();
			switch (secim) {
			case 1:
				toplama();
				break;
			case 2:
				cikarma();
				break;
			case 3:
				bolme();
				break;
			case 4:
				usAlma();
				break;

			default:
				System.out.println("geçerli sayı giriniz");
				break;
			}
		}

		System.out.println("--------");

	}
	
	public static void toplama() {
		int sayi = Integer.MAX_VALUE;
		int toplam = 0;

		do {
			System.out.println("sayı girin: ");
//			Scanner scanner = new Scanner(System.in);
			sayi = scanner.nextInt();
			toplam += sayi;
		} while (sayi != 0);
		System.out.println("sıfıra kadar girilen sayıların toplamı: " + toplam);
		Menu.menuyuGoster();
	}

	public static void cikarma() {
		int cikarmaSonucu = 0;
		System.out.println("kaç adet sayı çkarmak istiyorsunuz: ");
//		Scanner scanner = new Scanner(System.in);
		int sayiAdedi = scanner.nextInt();
		for (int i = 0; i < sayiAdedi; i++) {
			System.out.println((i + 1) + ". sayıyı girin: ");
			int sayi = scanner.nextInt();
			if (i == 0) {
				cikarmaSonucu += sayi;
			} else {
				cikarmaSonucu -= sayi;
			}

		}
		System.out.println("Çıkarma sonucu: " + cikarmaSonucu);
		Menu.menuyuGoster();

	}

	public static void bolme() {
		int bolmeSonucu = 1;
		System.out.println("kaç adet sayı bölmek istiyorsunuz: ");
//		Scanner scanner = new Scanner(System.in);
		int bolunecekSayiAdedi = scanner.nextInt();
		for (int i = 0; i < bolunecekSayiAdedi; i++) {
			System.out.println((i + 1) + ". sayıyı girin: ");
			int sayi = scanner.nextInt();
			if (i == 0) {
				bolmeSonucu *= sayi;
			} else {
				bolmeSonucu /= sayi;
			}

		}
		System.out.println("İlk sayıyı diğer sayılara bölmenin sonucu: " + bolmeSonucu);
		Menu.menuyuGoster();

	}

	public static void usAlma() {
		int usAlmaSonucu = 1;
//		Scanner scanner = new Scanner(System.in);
		System.out.println("hangi sayının kuvvetini almak istiyorsunuz: ");
		int sayi = scanner.nextInt();
		System.out.println("sayının kaçıncı kuvvetini almak istiyorsunuz: ");
		int kuvvet = scanner.nextInt();
		for (int i = 0; i < kuvvet; i++) {
			usAlmaSonucu *= sayi;

		}
		System.out.println("Üs alma işleminin sonucu: " + usAlmaSonucu);
		Menu.menuyuGoster();

	}

}
