package lesson019;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

public class PlakaTahmin {

	int oyunSayisi = 1;
	int hak = 3;

	HashMap<Integer, String> sehirler = new HashMap<>();
	HashMap<Integer, List<String>> tahminler = new HashMap<>();

	public PlakaTahmin() {
		mapOlustur();
	}

	public void mapOlustur() {
		sehirler.put(1, "Adana");
		sehirler.put(2, "Adıyaman");
		sehirler.put(3, "Afyonkarahisar");
		sehirler.put(4, "Ağrı");
		sehirler.put(5, "Amasya");
		sehirler.put(6, "Ankara");
		sehirler.put(7, "Antalya");
		sehirler.put(8, "Artvin");
		sehirler.put(9, "Aydın");
		sehirler.put(10, "Balıkesir");
		sehirler.put(11, "Bilecik");
		sehirler.put(12, "Bingöl");
		sehirler.put(13, "Bitlis");
		sehirler.put(14, "Bolu");
		sehirler.put(15, "Burdur");
		sehirler.put(16, "Bursa");
		sehirler.put(17, "Çanakkale");
		sehirler.put(18, "Çankırı");
		sehirler.put(19, "Çorum");
		sehirler.put(20, "Denizli");
		sehirler.put(21, "Diyarbakır");
		sehirler.put(22, "Edirne");
		sehirler.put(23, "Elazığ");
		sehirler.put(24, "Erzincan");
		sehirler.put(25, "Erzurum");
		sehirler.put(26, "Eskişehir");
		sehirler.put(27, "Gaziantep");
		sehirler.put(28, "Giresun");
		sehirler.put(29, "Gümüşhane");
		sehirler.put(30, "Hakkari");
		sehirler.put(31, "Hatay");
		sehirler.put(32, "Isparta");
		sehirler.put(33, "Mersin");
		sehirler.put(34, "İstanbul");
		sehirler.put(35, "İzmir");
		sehirler.put(36, "Kars");
		sehirler.put(37, "Kastamonu");
		sehirler.put(38, "Kayseri");
		sehirler.put(39, "Kırkareli");
		sehirler.put(40, "Kırşehir");
	}

	public void tahmin() {
		Scanner scanner = new Scanner(System.in);
		int randomPlaka = randomPlaka();
		List<String> tahminListesi = new ArrayList<>();

		System.out.println("random gelen plaka ---> " + randomPlaka);

		for (int i = hak; i > 0; i--) {
			System.out.println((hak - i + 1) + ". hakkınız: ");
			System.out.println(randomPlaka + " hangi şehrimizin plakasıdır?\n");
			String sehirTahmini = scanner.nextLine();
			tahminListesi.add(sehirTahmini);
			if (sehirTahmini.equalsIgnoreCase(sehirler.get(randomPlaka))) {
				String message = "Tebrikler " + sehirTahmini + " adlı şehri " + (hak - i + 1)
						+ ". hakkınızda doğru tahmin ettiniz.";
				System.out.println(message);
				break;
			} else {
				if (i - 1 == 0) {
					System.out.println("hakkınız kalmadı");
					System.out.println("doğru şehir: " + sehirler.get(randomPlaka));
				} else {
					System.out.println("yanlış tahmin " + (i - 1) + " hakkınız kaldı.");
				}

			}
		}
		tahminler.put(oyunSayisi, tahminListesi);
		oyunSayisi++;

	}

	public void tahminListem() {
		
		for (Entry<Integer, List<String>> entry : tahminler.entrySet()) {
			System.out.println(entry.getKey() + ". oyun tahminleri: " + entry.getValue());
		} 
		
		
//		for (int i = 0; i < oyunSayisi; i++) {
//			for (int j = 0; j < tahminler.size(); j++) {
//				System.out.println(tahminler + " " +tahminler.get(j));
//			}
//		}

	}

	private int randomPlaka() {
		Random random = new Random();
		int randomPlaka = random.nextInt(1, 41);
		return randomPlaka;
	}

}
