package lesson016.interfaceUygulama;

public class Main {

	// Kütüphane uygulaması yapalım
	// Kitap sınıfımız olsun
	// isim, yazar, fiyat attributes

	// Kutuphane: isim, Kitaplar

	// IKutuphaneManaher diye bir interface oluşturalım
	// interface'e kitapEkle() metodu yazalım

	// Util sınıfı oluşturalım
	// intDegerAl()
	// stringDegerAl()

	// Kullanıcıdan aldığımız isim, yazar, fiyatla bir kitap nesnesi oluşturalım

	// kitaplarıListele --> kitap ismi ve fiyatlarını görüntüleyelim

	// yazar ismine göre arama yapalım, "agmet" diyince yazdığı kitaplar gelsin

	// kitapSil() metodu yazalım. silmek istediğimiz kitabın ismini girelim
	// girdiğimiz kitap varsa silsin, yoksa girdiğiniz kitap yoktur desin

	// indirim yap metodu olsun. indirim yapılacak kitap ismi ve indirim oranı
	// alalım
	// alınan isimde kitap yoksa uyarı versin, varsa fiyatını güncelleyip güncel
	// fiyatını yazdırsın
	
	// kitapKontrolu metodu yazalım. kitap var mu yok mu bulur ve return eder
	
	// indirimde olanları gösteren metod 
	
	// kitabi güncelle metodunu yazalım ve ismini güncelleyelim
	
	// indirimde olan kitapları listeleyelim

	static Kutuphane kutuphane = new Kutuphane("NY Library");

	public static void adminMenu() {

		while (true) {
			System.out.println("1 - Kitap Ekle");
			System.out.println("2 - Kitapları Listele");
			System.out.println("3 - Yazar İsmine Göre Kitap Arama");
			System.out.println("4 - Kitap Sil");
			System.out.println("5 - İndirim Yap");
			System.out.println("6 - Kitap İsmini Güncelle");
			System.out.println("7 - İndirimde Olan Kitapları Göster");
	
			int secim = Util.intDegerAl("Seçiminiz:");

			switch (secim) {
			case 1:
				kutuphane.kitapEkle();
				break;
			case 2:
				kutuphane.kitaplariListele();
				break;
			case 3:
				kutuphane.yazarIsmineGoreArama();
				break;
			case 4:
				kutuphane.kitapSil();
				break;
			case 5:
				kutuphane.indirimYap();
				break;
			case 6:
				kutuphane.kitabiGuncelle();
				break;
			case 7:
				kutuphane.indirimdeOlanlariGoster();
				break;

			default:
				break;
			}
		}
	}

	public static void main(String[] args) {

//		Kitap kitap1 = new Kitap("Pal Sokağı Çocukları", "Ferenc Molnar", 15);
//		Kitap kitap2 = new Kitap("Fareler ve İnsanlar", "John Steinbeck", 42);
//		Kitap kitap3 = new Kitap("Şeker Portakalı", "Jose Mauro De Vasconcelos", 30);
//		Kitap kitap4 = new Kitap("Kırmızı Pazartesi", "Gabriel Garcia Marquez", 21);
//		Kitap kitap5 = new Kitap("Simyacı", "Paulo Coelho", 42);
//		Kitap kitap6 = new Kitap("Nietzsche Ağladığında", "Irvin D. Yalom", 97);

		adminMenu();
	}

}
