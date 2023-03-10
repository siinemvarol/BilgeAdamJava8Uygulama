package lesson013;

import java.util.Scanner;

public class Sinav {

	// programı run ettiğimde arka tarafta heapte kendine bir yer açıyordu

	static String[] cevapSecenekleri = { "A", "B", "C", "D" };
	private int maxPuan;
	private int sure;
	private int soruSayisi;
	private String ders;
	private String konu;
	private Soru[] sorular;
	private String[] cevaplar;

	public Sinav() {
		super();
	}

	public int getMaxPuan() {
		return maxPuan;
	}

	public void setMaxPuan(int maxPuan) {
		this.maxPuan = maxPuan;
	}

	public int getSure() {
		return sure;
	}

	public void setSure(int sure) {
		this.sure = sure;
	}

	public int getSoruSayisi() {
		return soruSayisi;
	}

	public void setSoruSayisi(int soruSayisi) {
		this.soruSayisi = soruSayisi;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}

	public String getKonu() {
		return konu;
	}

	public void setKonu(String konu) {
		this.konu = konu;
	}

	public Soru[] getSorular() {
		return sorular;
	}

	public void setSorular(Soru[] sorular) {
		this.sorular = sorular;
	}

	public String[] getCevapSecenekleri() {
		return cevapSecenekleri;
	}

	public void setCevapSecenekleri(String[] cevapSecenekleri) {
		this.cevapSecenekleri = cevapSecenekleri;
	}

	public String[] getCevaplar() {
		return cevaplar;
	}

	public void setCevaplar(String[] cevaplar) {
		this.cevaplar = cevaplar;
	}

	public void sinavOlustur() {
		// dersi alalım
		// konuyu alalım
		// sınav süresi alalım
		// soru sayısını alalım -> 5
		// 5 tane soru oluşturalım

		Scanner scanner = new Scanner(System.in);
		System.out.println("dersi girin: ");
		ders = scanner.nextLine();
		System.out.println("konuyu girin: ");
		konu = scanner.nextLine();
		System.out.println("sınav süresini girin: ");
		sure = Integer.valueOf(scanner.nextLine());
		System.out.println("kaç soru sormak istiyorsunuz: ");
		soruSayisi = Integer.valueOf(scanner.nextLine()); // sorular = new Soru[scanner.nextInt()];

		sorular = new Soru[soruSayisi];

		for (int i = 0; i < sorular.length; i++) {
			sorular[i]= new Soru();							// Soru soru = new Soru();  
			sorular[i].soruOlustur(cevapSecenekleri);		// sorular[i].soruOlustur(cevapSecenekleri);
															//	sorular[i] = soru;
		}													

	}
	
	public void cevapGir() {
		// soruları ve şıkları görmemiz lazım
		// aldığımız cevapları arrayde tutalım
		// kullanıcıdan aldığımız cevapları cevaplar arrayine atalım 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(ders + " dersinin " + konu + " konulu sınavı. süre: " + sure);
				
		cevaplar = new String[sorular.length];
		
		for (int i = 0; i<sorular.length; i++) {
			System.out.println((i + 1) + ". soru: " + sorular[i].getIcerik());
			for (int j = 0; j < sorular[i].getCevapIcerikleri().length; j++) {
				System.out.println(cevapSecenekleri[j] + " - " + sorular[i].getCevapIcerikleri()[j]);
			}
			System.out.println("Lütfen cevabınızı girin: ");
			cevaplar[i] = scanner.nextLine().toUpperCase();
				
		}

	}
	public void cevaplariKontrolEt() {
		// dogruSayisi
		// yanlisSayisi
		// puanı hesaplayalım ve kullanıcıya gösterelim
		
		int dogru = 0;
		int yanlis = 0;
		int puan = 0;
		
		for (int i = 0; i < sorular.length; i++) {
			if (cevaplar[i].equals(sorular[i].getDogruCevap())){
				dogru++;
				puan += sorular[i].getPuan();
			}
			else {
				yanlis++;
			}
		}
		System.out.println("doğru cevap sayınız: " + dogru);
		System.out.println("yanlış cevap sayınız: " + yanlis);
		System.out.println("toplam puan: " + puan);
	}

}
