package lesson009;

import java.util.Scanner;

public class Question69 {

	// parametre olarak girilen harfe göre, ikinci harfi girilen harf ile aynı olan
	// şehirlerin
	// ilk üç harfini büyük bastıran metod

	static String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };

	private static void illeriBul(char harf) {
		for (int i = 0; i < iller.length; i++) {
			if (iller[i].charAt(1) == harf) {

				String firstThree = iller[i].substring(0, 3).toUpperCase();

				System.out.println(firstThree);
			}

		}

	}

	// plakaBul(iller, "Ankara", "Karaman");
	// parametre olarak array ve sınırsız sayıda String olarak şehir alsın
	// girilen şehirlerin plakalarını yazdırsın

	private static void plakaBul(String[] array, String... il) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < il.length; j++) {
				if (array[i].equals(il[j])) {
					if (i < 10) {
						System.out.println("plaka: 0" + (i + 1) + " " + array[i]);
					} else {
						System.out.println("plaka: " + (i + 1) + " " + array[i]);
					}
				}
			}
		}

	}

	// B harfi ile başlayan şehirlerin ilk 3 harfini alalım
	// metod parametre olarak dizi alsın, for each kullanalım

	public static void bIleBaslayanSehirler(String[] array) {
		for (String il : array) {
			if (il.startsWith("B")) { // il.charAt(0) da olabilirdi bu koşul
				String firstThree2 = il.substring(0, 3).toUpperCase();
				System.out.println(firstThree2);
			}
		}

	}

	// Sesli harfleri silip silinmiş halini return eden bir metod yazalım
	// metod string array dönecek, parametre almayacak
	// return edilen arrayi mainde yazdıralım

	// aşağıdaki metod ilk büyük olan harfleri silemiyor
	public static String[] sesliHarfleriSil() {

		String[] sesliHarfleriSilinmis = new String[iller.length];
		for (int i = 0; i < iller.length; i++) {
			for (int j = 0; j < iller[i].length(); j++) {
				char kontrol = iller[i].charAt(j);
				switch (kontrol) {
				case 'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü':
					iller[i].replaceAll(String.valueOf(kontrol), "");
					break;
				case 'A', 'E', 'I', 'İ', 'O', 'Ö', 'U', 'Ü':
					iller[i].replaceAll(String.valueOf(kontrol), "");
					break;

				default:
					break;
				}

			}
			sesliHarfleriSilinmis[i] =	iller[i];
		}
		return sesliHarfleriSilinmis;
	}
	
	// aşağıdaki metod yeni bir arraye atamıyor
//	private static String[] sesliHarfleriSil2() {
//		String[] sesliSil = new String[iller.length];
//		int a = 0;
//		for (String kelime : iller) {
//			for (int i = 0; i < kelime.length(); i++) {
//				if ("AEIİOÖUÜaeıioöuü".contains(String.valueOf(kelime.charAt(i)))) {
//					sesliSil[i] = kelime.replace(String.valueOf(kelime.charAt(i)), "");
//					
//				}
//			}
//		}
//		return sesliSil;
//	}
	
	// aşağıdaki metod çalışıyor ama tüm ilk harfleri küçük harfe çeviriyor
	public static String[] sesliHarfleriSil3() {
		String[] sesliHarfler = {"a", "e", "ı", "i", "o", "ö", "u", "ü"};
		String[] yeniDizi = new String[iller.length];
		
		for (int i = 0; i < iller.length; i++) {
			for (int j = 0; j < sesliHarfler.length; j++) {
				if(iller[i].toLowerCase().contains(sesliHarfler[j])) {
					iller[i] = iller[i].toLowerCase().replace(sesliHarfler[j], "");
				}
			}
			yeniDizi[i] = iller[i];
		}
		return yeniDizi;
	}

	public static void main(String[] args) {

//		illeriBul('a');
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("değer girin: ");
//		String deger = scanner.nextLine();
//
//		illeriBul(deger.charAt(0));
//
//		plakaBul(iller, "Ankara", "Karaman", "Tekirdağ");
//
//		System.out.println("------");
//		bIleBaslayanSehirler(iller);
//
//		System.out.println("------");
//		String [] sesliHarfleriSilinmis = sesliHarfleriSil3();
//		for (int i = 0; i < sesliHarfleriSilinmis.length; i++) {
//			System.out.println(sesliHarfleriSilinmis[i]);
//		}
		
		System.out.println("\n------");
		String [] sesliHarfleriSilinmis2 = sesliHarfleriSil();
		for (int i = 0; i < sesliHarfleriSilinmis2.length; i++) {
			System.out.println(sesliHarfleriSilinmis2[i]);
		}

	}

}
