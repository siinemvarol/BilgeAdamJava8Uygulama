package lesson021;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Uygulama {

	// 1 - bir yuk yeri seçme metodumuz olsun
	// bu metod limandaki yükler arrayinden bir yer belirlesin kendine
	// eğer mevcut sınırdan fazla ise hata fırlatalım

	// 2 - Kendi exception sınıfımızı yaratalım
	// LimanAppException, seçtiğimiz yer null değilse hata fırlatacağız
	// kendi yazdığımız exception sınıfını throw edeceğiz

	// 3 - hata mesajları için Enum sınıfı oluşturalım
	// ErrorType --> hata mesajının kodu, mesaj kısmı olsun

	// 4 - Ağırlık belirle metodu -> 100 kilo altı yükler kabul edilmiyor
	// 100'ün altında değer gelirse exception fırlatacağız.
	// double değer döndürsün.

	// 5 - limanımız cuma günleri ürün kabul etmiyor
	// kullanıcıdan tarih alacağız, cuma günüyse ürün almayacağız
	
	// 6 - yukOlustur() metodu yazalım

	static Scanner scanner = new Scanner(System.in);

	public static void yukYeriSec(Liman liman, Yuk yuk) {
		System.out.println("yükü koymak istediğiniz yerin numarasını girin: ");
		int yerNo = scanner.nextInt();

		for (int i = 0; i < liman.getYukler().length; i++) {

			if (yerNo == i) {
				try {
					liman.getYukler()[i] = yuk;
				} catch (Exception e) {
					// TODO: handle exception
				}

			}

		}
	}

	// ---------------------------------------------------------------------------------

	Liman liman;

	public Uygulama() {
		this.liman = new Liman();
	}

	public void yukYeriSec2() {
		System.out.println("yükü koymak istediğiniz yerin numarasını girin: ");
		int index = scanner.nextInt();

		try {
			Yuk yuk = liman.getYukler()[index];
		} catch (Exception e) {
			System.out.println("Lütfen sınırlar dahilinde bir yer seçin");
		}

	}

	// 0 ile yükler arrayi uzunluğu arasında bir yer seçmek için override edelim
	// int değer dönsün index
	public int yukYeriSec3() {
		System.out.println("yükü koymak istediğiniz yerin numarasını girin: ");
		int index = scanner.nextInt();
		if (index < 0 || index >= liman.getYukler().length) {
			throw new IndexOutOfBoundsException("Lütfen aralıkta bir değer girin");
		}
		return index;

	}

	/// ------------------------------------------------------------------

	public int yukYeriSec4() throws LimanAppException {

		liman.getYukler()[0] = new Yuk("1 palet kıyafet", 150, LocalDate.now());

		int index = Util.intDegerAl("yükü koymak istediğiniz yerin numarasını girin: ");
		if (index < 0 || index >= liman.getYukler().length) {
			throw new LimanAppException(EErrorType.OUT_OF_BOUNDS, "yeni yazdığım hata mesajı");
		} else if (liman.getYukler()[index] != null) {
			throw new LimanAppException(EErrorType.SEAT_ALREADY_OCCPUIED);
		}

		return index;
	}

	/// ------------------------------------------------------------------

	public double agirlikBelirle() {

		double agirlik = Util.doubleDegerAl("yükün ağırlığını (kg) girin: ");
		if (agirlik < 100) {
			throw new LimanAppException(EErrorType.LIGHT_WEIGHT);
		}

		return agirlik;
	}

	/// ------------------------------------------------------------------

	public LocalDate kabulTarihiKontrol() {
		// Geçmişteki bir tarih aldığımızda hata fırlatalım
		LocalDate date = Util.stringTarih();
		
		if (date.isBefore(LocalDate.now())) {
			throw new LimanAppException(EErrorType.PAST_DATE);
		}
		else if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
			throw new LimanAppException(EErrorType.OUT_OF_SHIFT_DAY);
		}
		
		return date;

	}
	
	/// ------------------------------------------------------------------
	
	public void yukOlustur() {
	Yuk yuk = null;
	int index = 0;
		try {
			String name = Util.stringDegerAl("Yükün adını girin:");
			double agirlik = agirlikBelirle();
			LocalDate date = kabulTarihiKontrol();
			
			index = yukYeriSec4();
			yuk = new Yuk(name, agirlik, date);
						
			liman.getYukler()[index] = yuk;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (yuk == null) {
				System.out.println("Yükünüz kabul edilmedi");
			}
			else {
				System.out.println("Yükünüz istediğiniz yere yerleşti. Yeri: " + index);
			}
		}
						
	}

	public static void main(String[] args) {

		Uygulama uygulama = new Uygulama();

//		try {
//			uygulama.yukYeriSec3();
//		} catch (IndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}

		// ------------------------------------------

//		try {
//			uygulama.yukYeriSec4();
//		} catch (IndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		} catch (LimanAppException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}

		// ------------------------------------------

//		try {
//			uygulama.agirlikBelirle();
//		} catch (IndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		} catch (LimanAppException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		
		// ------------------------------------------
		
//		try {
//			uygulama.yukYeriSec4();
//			uygulama.agirlikBelirle();
//			uygulama.kabulTarihiKontrol();
//		} catch (IndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		} catch (LimanAppException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		
		// ------------------------------------------

		uygulama.yukOlustur();
		
		System.out.println("\nmain son satır çalışıyor mu");

	}

}