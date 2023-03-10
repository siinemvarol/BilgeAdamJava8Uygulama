package lesson016.interfaceUygulama;

import java.util.ArrayList;
import java.util.List;

public class Kutuphane implements IKutuphaneManager {

	private String name;
	private List<Kitap> kitapListesi;

	public Kutuphane(String name) {
		super();
		this.name = name;
		this.kitapListesi = new ArrayList<>();
		System.out.println("kütüphane oluştu");

	}

	@Override
	public void kitapEkle() {

		String isim = Util.stringDegerAl("Lütfen kitap ismi girin: ");
		String yazar = Util.stringDegerAl("Lütfen yazarı girin: ");
		int fiyat = Util.intDegerAl("Lütfen kitabın fiyatını girin: ");

		Kitap kitap = new Kitap(isim, yazar, fiyat);
		kitapListesi.add(kitap);
		System.out.println(kitap.getIsim() + " kütüphaneye eklendi");

	}

	@Override
	public void kitaplariListele() {
		for (Kitap kitap : kitapListesi) {
			System.out.println("Kitap ismi: " + kitap.getIsim() + " Fiyatı: " + kitap.getFiyat());
		}

	}

	@Override
	public void yazarIsmineGoreArama() {
		String yazar = Util.stringDegerAl("Yazar ismini girin: ");
		for (Kitap kitap : kitapListesi) {
			if (kitap.getYazar().equalsIgnoreCase(yazar)) {
				System.out.println(yazar + " yazarına ait " + kitap.getIsim() + " kitabı bulundu.");
			}
		}

	}

	public void yazarIsmineGoreArama2() {
		String yazar = Util.stringDegerAl("Yazar ismini girin: ");
		for (int i = 0; i < kitapListesi.size(); i++) {
			if (kitapListesi.get(i).getYazar().equalsIgnoreCase(yazar)) {
				System.out.println(yazar + " yazarına ait " + kitapListesi.get(i).getIsim() + " kitabı bulundu.");
			}
		}

		for (Kitap kitap : kitapListesi) {
			if (kitap.getYazar().equalsIgnoreCase(yazar)) {
				System.out.println(yazar + " yazarına ait " + kitap.getIsim() + " kitabı bulundu.");
			}
		}

	}

	@Override
	public void kitapSil() {
		String kitapIsmi = Util.stringDegerAl("Silmek istediğiniz kitap ismini girin: ");
		Kitap kitap = kitapKontrolu(kitapIsmi);
		if (kitap != null) {
			kitapListesi.remove(kitap);
			System.out.println(kitap.getIsim() + " kitabı silindi.");
		}

//		boolean kitapSilindiMi = false;
//		for (int i = 0; i < kitapListesi.size(); i++) {
//			if (kitapListesi.get(i).getIsim().equalsIgnoreCase(kitapIsmi)) {
//				System.out.println(kitapListesi.get(i).getIsim() + " kitabı silindi.");
//				kitapListesi.remove(i);
//				kitapSilindiMi = true;
//			}
//			if (kitapSilindiMi == false) {
//				System.err.println("silmek istediğiniz kitap bulunamadı !");
//			}
//		}

	}

	@Override
	public void indirimYap() {
		String kitapIsmi = Util.stringDegerAl("İndirim yapmak istediğiniz kitap ismini girin: ");
		int indirimOrani = Util.intDegerAl("İndirim yapmak istediğiniz % oranı girin: ");

		Kitap kitap = kitapKontrolu(kitapIsmi);
		if (kitap != null) {
			kitap.setFiyat(kitap.getFiyat() - kitap.getFiyat() * indirimOrani * 0.01);
			kitap.setIndirimdeMi(true);
			System.out.println(kitap.getIsim() + " kitabına %" + indirimOrani + " indirim yapıldı. Güncel fiyat: "
					+ kitap.getFiyat());
		}

//		boolean indirimYapildiMi = false;
//		for (int i = 0; i < kitapListesi.size(); i++) {
//			if (kitapListesi.get(i).getIsim().equalsIgnoreCase(kitapIsmi)) {
//				kitapListesi.get(i).setFiyat(
//						kitapListesi.get(i).getFiyat() - (kitapListesi.get(i).getFiyat() * indirimOrani * 0.01));
//				System.out.println(kitapListesi.get(i).getIsim() + " kitabına %" + indirimOrani
//						+ " indirim yapıldı. Güncel fiyat: " + kitapListesi.get(i).getFiyat());
//				indirimYapildiMi = true;
//			}
//			if (indirimYapildiMi == false) {
//				System.err.println("indirim yapmak istediğiniz kitap bulunamadı !");
//			}
//		}
	}

	private Kitap kitapKontrolu(String name) {
		for (int i = 0; i < kitapListesi.size(); i++) {
			if (kitapListesi.get(i).getIsim().equalsIgnoreCase(name)) {
				return kitapListesi.get(i);
			}
		}
		System.out.println("aranan kitap bulunamadı");
		return null;

	}

	@Override
	public void kitabiGuncelle() {
		String kitapKontrolu = Util.stringDegerAl("Güncelleme yapmak istediğiniz kitap ismini girin: ");
		Kitap kitap = kitapKontrolu(kitapKontrolu);		
		if (kitap != null) {
			String kitapIsmi = Util.stringDegerAl("Güncellemek istediğiniz yeni ismi girin: ");
			System.out.println(kitap.getIsim() + " kitabının ismi güncelleniyor...");
			kitap.setIsim(kitapIsmi);
			System.out.println(kitap.getIsim() + " olarak güncellendi.");
		}

	}
	
	@Override
	public void indirimdeOlanlariGoster() {
		for (Kitap kitap : kitapListesi) {
			if (kitap.isIndirimdeMi()) {
				System.out.println(kitap.getIsim() + " kitabı indirimdedir");
			}
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Kitap> getKitapListesi() {
		return kitapListesi;
	}



}
