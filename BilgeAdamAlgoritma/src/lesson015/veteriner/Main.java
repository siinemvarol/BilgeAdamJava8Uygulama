package lesson015.veteriner;

public class Main {
	
	// kedi nesnesi oluşturduğumuzda kedinin türü olarak otomatik olarak "kedi" olsun
	// köpek nesnesi oluşturduğumuzda köpeğin türü olarak otomatik olarak "köpek" olsun
	
	// Hayvan sınıfında 2 tane abstract metod oluşturalım
	// bilgileri göster -> toString metodunu kullanalım
	// diğer metod da karneOlustur() -> cinsini ve türünü alıp bize karne oluştursun
	
	// Ortak bir metod yazalım. gelen parametreye göre karne oluştursun
	
	// Müşterilerimizin hayvanları olabilir
	// Müşteri sınıfında bir ArrayList oluşturalım
	
	// Hayvan ekle metodu yazalım
	// HayvanNesnei + musteriIsmi + " e eklendi"
	
	// hayvanlarıListele() metodu: müşterinin sahip olduğu hayvanları listele
	
	// Veterinerler
	// Müşterileri olabilir. Müşteri ekle metodu yazalım
	// Veterinerin müşterilerini görntüleyelim
	
	// Müşterinin hayvanlarından kayıtlı olanları getiren metodu yazalım
	
	public static void karneOlusturMain(Hayvan hayvan) {
		hayvan.karneOlustur();
		
	} 	

	public static void main(String[] args) {
		
		Kedi kedi1 = new Kedi("boncuk", true, "2020", "tekir");
		Kedi kedi2 = new Kedi("şanslı", false, "2015", "van kedisi");
		Kedi kedi3 = new Kedi("beyaz", true, "2012", "tekir");
		
		Kopek kopek1 = new Kopek("max", true, "2016", "rott.");
		Kopek kopek2 = new Kopek("goldie", true, "2019", "golden");
		Kopek kopek3 = new Kopek("miniş", true, "2021", "terrier");
		
		
		kedi1.bilgileriGoster();
		kopek1.bilgileriGoster();
		
		kedi1.karneOlustur();
		kopek1.karneOlustur();
		
		System.out.println(kedi1.getKarne());
		
		Hayvan hayvan1 = new Kedi ("Beyaz", true, "2012", "tekir");
		hayvan1.karneOlustur();
		karneOlusturMain(hayvan1);
		karneOlusturMain(kedi1);
		karneOlusturMain(kopek2);
		
		System.out.println("- - - - -");
		
		Musteri musteri1 = new Musteri("115544", "sinem", "üsküdar");
		musteri1.hayvanEkle(kopek2);
		musteri1.bilgileriGoster();
		
		musteri1.hayvanEkle(kedi1);
		musteri1.bilgileriGoster();
		
		// en fazla 3 hayvan ekleme
		musteri1.hayvanEkle(kedi2);		
		musteri1.hayvanEkle(kedi3);
		musteri1.bilgileriGoster();
		
		// hayvanları listeleme
		System.out.println();
		musteri1.hayvanlariListele();
		
		//
		System.out.println("\n- - - - -");
		Veteriner veteriner1 = new Veteriner("111", "derya", "istanbul üni.", 5);
		veteriner1.musteriEkle(musteri1);
		veteriner1.musteriGoruntule();
		
		// müşterinin haycanlarından kayıtlı olanları getirme
		System.out.println("\n- - - - -");
		veteriner1.emailGonder(musteri1);
	}

}
